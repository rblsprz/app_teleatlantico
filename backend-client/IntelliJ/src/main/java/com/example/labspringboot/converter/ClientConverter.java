package com.example.labspringboot.converter;

import com.example.labspringboot.model.Client;
import com.example.labspringboot.model.ClientDTO;
import org.springframework.stereotype.Service;


@Service
public class ClientConverter  {




    public ClientDTO Response(Client client) {

       ClientDTO clientDTO = new ClientDTO();
        clientDTO.setName(client.getName());
        clientDTO.setFirstsurname(client.getFirstsurname());
        clientDTO.setSecondsurname(client.getSecondsurname());
        clientDTO.setAddress(client.getAddress());
        clientDTO.setPhone(client.getPhone());
        clientDTO.setSecondcontact(client.getSecondcontact());
        clientDTO.setEmail(client.getEmail());
        clientDTO.setPassword(client.getPassword());
        clientDTO.setTelevision(client.getTelevision());
        clientDTO.setMobilephone(client.getMobilephone());
        clientDTO.setTelephone(client.getTelephone());
        clientDTO.setInternet(client.getInternet());
        clientDTO.setCreationdate(client.getCreationdate());
        clientDTO.setCreationuser(client.getCreationuser());
        clientDTO.setUpdatedate(client.getUpdatedate());
        clientDTO.setUpdateuser(client.getUpdateuser());

        return clientDTO;
    }


    public Client Request(ClientDTO dto) {
        return null;
    }


}
