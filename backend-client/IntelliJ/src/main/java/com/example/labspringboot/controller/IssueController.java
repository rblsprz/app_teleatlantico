package com.example.labspringboot.controller;

import com.example.labspringboot.model.Issue;
import com.example.labspringboot.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;
import com.example.labspringboot.converter.IssueConverter;
import com.example.labspringboot.model.IssueDTO;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/issue")
@RestController
public class IssueController {

    @Autowired
    private IssueService service;
    private RestTemplate restTemplate = new RestTemplate();
    private IssueConverter issueConverter = new IssueConverter();


    @GetMapping("/issues")
    public List<Issue> list() {
        return service.listAll();
    }

    @GetMapping("/issues/{id}")
    public List<Issue> SelectIssueByClient(@PathVariable Integer id) {
        return service.SelectIssueByClient(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Issue> getById(@PathVariable Integer id){
        try {
            Issue issue = service.get(id);
            return new ResponseEntity<Issue>(issue, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Issue>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public IssueDTO add(@RequestBody Issue issue) {
        IssueDTO issueDTO=new IssueDTO();
        try {
            service.save(issue);
            issueDTO= issueConverter.Response(issue);
           // ResponseEntity<IssueDTO> response=restTemplate.postForEntity("http://localhost:53802/api/Issue",issueDTO, IssueDTO.class);

        } catch (NoSuchElementException e) {
            throw e;
        }
        return issueDTO;
    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT)
    public Issue update( @RequestBody IssueDTO issue) {
        Issue existingIssue =new Issue();
        try{
            existingIssue = service.SelectIssueByReportNumber(issue.getReportnumber());
            service.update(issueConverter.Request(issue,existingIssue));


        } catch (NoSuchElementException e) {
            throw e;
        }
        return existingIssue;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }


}
