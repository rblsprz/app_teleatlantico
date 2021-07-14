package com.example.labspringboot.controller;

import com.example.labspringboot.converter.CommentConverter;
import com.example.labspringboot.converter.IssueConverter;
import com.example.labspringboot.model.ClientDTO;
import com.example.labspringboot.model.Comment;
import com.example.labspringboot.model.CommentDTO;
import com.example.labspringboot.model.Issue;
import com.example.labspringboot.model.IssueDTO;
import com.example.labspringboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/comment")
@RestController
public class CommentController {

    @Autowired
    private CommentService service;
    @Autowired
    private CommentConverter commentConverter;
    private RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/comments")
    public List<Comment> list() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getById(@PathVariable Integer id){
        try {
            Comment comment = service.get(id);
            return new ResponseEntity<Comment>(comment, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Comment>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/comments/{reportNumber}")
    public List<Comment> SelectCommentByIssue(@PathVariable String reportNumber) {
        return service.SelectCommentByIssue(reportNumber);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public CommentDTO add(@RequestBody Comment comment) {
        CommentDTO commentDTO=new CommentDTO();
        try {
            service.save(comment);
            commentDTO= commentConverter.Request(comment);
           // ResponseEntity<CommentDTO> response=restTemplate.postForEntity("http://localhost:53802/api/Comment/PostFromClient",commentDTO, CommentDTO.class);

        } catch (NoSuchElementException e) {
           throw e;
        }
        return commentDTO;
    }
    
    @RequestMapping(path = "/addCommentDTo", method = RequestMethod.POST)
    public int addCommentDTO(@RequestBody CommentDTO commentDTO) {
        try {
        	Comment comment = commentConverter.Response(commentDTO);
            service.save(comment);
            return 1;
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
