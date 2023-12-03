package com.thesun4sky.todoparty.dto;

import java.time.LocalDateTime;

import com.thesun4sky.todoparty.entity.Comment;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommentResponseDTO extends CommonResponseDTO {
	private Long id;
	private String text;
	private UserDTO user;
	private LocalDateTime createDate;

	public CommentResponseDTO(Comment comment) {
		this.id = comment.getId();
		this.text = comment.getText();
		this.user = new UserDTO(comment.getUser());
		this.createDate = comment.getCreateDate();
	}
}
