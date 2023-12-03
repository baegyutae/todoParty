package com.thesun4sky.todoparty.entitytest;

import com.thesun4sky.todoparty.dto.CommentRequestDTO;
import com.thesun4sky.todoparty.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommentTest {
    @Test
    @DisplayName("댓글 생성")
    void createComment() {
        // Given
        String text = "댓글 생성";
        CommentRequestDTO dto = new CommentRequestDTO();
        dto.setText(text);

        // When
        Comment comment = new Comment(dto);

        // Then
        assertEquals(text, comment.getText());
    }
}
