package com.example.labspringboot.converter;

import com.example.labspringboot.model.Issue;
import com.example.labspringboot.model.IssueDTO;
import org.springframework.stereotype.Service;

@Service
public class IssueConverter  {


    public Issue Request(IssueDTO issueDTO, Issue existingIssue) {


        existingIssue.setReportnumber(issueDTO.getReportnumber());
        existingIssue.setContactemail(issueDTO.getContactemail());
        existingIssue.setStatus(issueDTO.getStatus());
        existingIssue.setDescription(issueDTO.getDescription());
        existingIssue.setService(issueDTO.getService());
        existingIssue.setCreationdate(issueDTO.getCreationdate());
        existingIssue.setCreationuser(issueDTO.getCreationuser());
        existingIssue.setUpdatedate(issueDTO.getUpdatedate());
        existingIssue.setUpdateuser(issueDTO.getUpdateuser());

        return existingIssue;
    }

    public IssueDTO  Response(Issue issue) {

        IssueDTO issueDTO=new IssueDTO();
        issueDTO.setClassification("");
        issueDTO.setResolutioncomment("");
        issueDTO.setReportnumber(issue.getReportnumber());
        issueDTO.setContactemail(issue.getContactemail());
        issueDTO.setStatus(issue.getStatus());
        issueDTO.setDescription(issue.getDescription());
        issueDTO.setService(issue.getService());
        issueDTO.setCreationdate(issue.getCreationdate());
        issueDTO.setCreationuser(issue.getCreationuser());
        issueDTO.setUpdatedate(issue.getUpdatedate());
        issueDTO.setUpdateuser(issue.getUpdateuser());

        return issueDTO;
    }


}
