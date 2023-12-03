package com.thesun4sky.todoparty.entitytest;

import com.thesun4sky.todoparty.entity.Todo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TodoTest {
    @Test
    @DisplayName("할일 카드 생성")
    void createTodo() {
        // Given
        String title = "과제 하기";
        String content = "심화주차 개인과제";

        // When
        Todo todo = new Todo(title, content);

        // Then
        assertEquals(title, todo.getTitle());
        assertEquals(content, todo.getContent());
//        assertFalse(todo.getIsCompleted());
    }
}
