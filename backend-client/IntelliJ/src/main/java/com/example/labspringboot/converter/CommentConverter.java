package com.example.labspringboot.converter;

import com.example.labspringboot.model.*;
import org.springframework.stereotype.Service;

@Service
public class CommentConverter {

	public Comment Response(CommentDTO commentDTO) {

		Comment comment = new Comment();
		comment.setDescription(commentDTO.getDescription());
		comment.setReportnumber(commentDTO.getReportnumber());
		comment.setCreationdate(commentDTO.getCreationdate());
		comment.setCreationuser(commentDTO.getCreationuser());
		comment.setUpdatedate(commentDTO.getUpdatedate());
		comment.setUpdateuser(commentDTO.getUpdateuser());
		comment.setUpdateuser(commentDTO.getUpdateuser());
		
	        return comment;
	    }

	public CommentDTO Request(Comment comment ) {

		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setDescription(comment.getDescription());
		commentDTO.setReportnumber(comment.getReportnumber());
		commentDTO.setCreationdate(comment.getCreationdate());
		commentDTO.setCreationuser(comment.getCreationuser());
		commentDTO.setUpdatedate(comment.getUpdatedate());
		commentDTO.setUpdateuser(comment.getUpdateuser());
		commentDTO.setUpdateuser(comment.getUpdateuser());


		return commentDTO;
	}
}
