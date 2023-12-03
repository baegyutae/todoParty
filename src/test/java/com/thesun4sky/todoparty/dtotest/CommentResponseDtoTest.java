package com.thesun4sky.todoparty.dtotest;

import com.thesun4sky.todoparty.dto.CommentResponseDTO;
import com.thesun4sky.todoparty.entity.Comment;
import com.thesun4sky.todoparty.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommentResponseDtoTest {
    @Test
    void createCommentResponseDto() {
        // Given
        Comment comment = new Comment();
        comment.setText("과제 했음?");
        comment.setUser(new User("배규태","1234"));

        // When
        CommentResponseDTO commentResponseDTO = new CommentResponseDTO(comment);

        // Then
        assertEquals(comment.getText(), commentResponseDTO.getText());
        assertEquals(comment.getUser().getUsername(), commentResponseDTO.getUser().getUsername());
    }
}
