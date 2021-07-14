package com.example.labspringboot.repository;

import com.example.labspringboot.model.Comment;
import com.example.labspringboot.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @Query(value = "{ call SelectCommentByIssue(:number)}", nativeQuery = true)
    List<Comment> SelectCommentByIssue(@Param("number") String reportnumber);
}
