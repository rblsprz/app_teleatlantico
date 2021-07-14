package com.example.labspringboot.service;

import com.example.labspringboot.model.Client;
import com.example.labspringboot.model.Issue;
import com.example.labspringboot.model.IssueDTO;
import com.example.labspringboot.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class IssueService {

    @Autowired
    private IssueRepository repository;

    public List<Issue> listAll(){return repository.findAll();}
    public void save(Issue issue){repository.save(issue);}
    public Issue get (int id){ return repository.findById(id).get();}
    public void delete(int id){repository.deleteById(id);}
    public List<Issue> SelectIssueByClient(int id) {
        return repository.SelectIssueByClient(id);
    }
    public Issue update(Issue issue) {return repository.save(issue);}
    public Issue SelectIssueByReportNumber(String reportnumber) {
        return repository.SelectIssueByReportNumber(reportnumber);
    }


}
