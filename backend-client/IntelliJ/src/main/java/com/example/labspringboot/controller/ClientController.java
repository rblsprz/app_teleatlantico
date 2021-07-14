package com.example.labspringboot.controller;

import com.example.labspringboot.model.Client;
import com.example.labspringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.NoSuchElementException;
import com.example.labspringboot.converter.ClientConverter;
import com.example.labspringboot.model.ClientDTO;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/client")
@RestController
public class ClientController {

    @Autowired
    private ClientService service;
    private RestTemplate restTemplate = new RestTemplate();
    private ClientConverter clientConverter = new ClientConverter();

    @GetMapping("/clients")
    public List<Client> list() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getById(@PathVariable Integer id){
        try {
            Client client = service.get(id);
            return new ResponseEntity<Client>(client, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public Client SelectClientByEmail(@RequestBody Client client)
    {
        return service.SelectClientByEmail(client);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public ClientDTO add(@RequestBody Client client) {

        ClientDTO clientDTO = new ClientDTO();
        try {
            service.save(client);
            clientDTO= clientConverter.Response(client);
           /* ResponseEntity<ClientDTO> response=restTemplate.postForEntity("http://localhost:53802/api/Client",clientDTO, ClientDTO.class);*/

        } catch (NoSuchElementException  e) {
            throw e;
        }
        return clientDTO;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
