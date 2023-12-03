package com.thesun4sky.todoparty.repositorytest;

import com.thesun4sky.todoparty.entity.Comment;
import com.thesun4sky.todoparty.repository.CommentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Test
    void saveComment() {
        // Given
        Comment comment = new Comment();
        comment.setText("댓글 생성");
        commentRepository.save(comment);

        // When
        Comment foundComment = commentRepository.findById(comment.getId()).orElse(null);

        // Then
        assertNotNull(foundComment);
        assertEquals("댓글 생성", foundComment.getText());
    }
}