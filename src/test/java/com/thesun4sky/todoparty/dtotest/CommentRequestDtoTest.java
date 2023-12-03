package com.thesun4sky.todoparty.dtotest;

import com.thesun4sky.todoparty.dto.CommentRequestDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommentRequestDtoTest {
    @Test
    @DisplayName("댓글 생성")
    void createCommentRequestDto() {
        // Given
        String text = "과제 했음?";

        // When
        CommentRequestDTO commentRequestDTO = new CommentRequestDTO();
        commentRequestDTO.setText(text);

        // Then
        assertEquals(text, commentRequestDTO.getText());
    }
}
