package com.thesun4sky.todoparty.dtotest;

import com.thesun4sky.todoparty.dto.TodoResponseDTO;
import com.thesun4sky.todoparty.entity.Todo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoResponseDtoTest {
    @Test
    @DisplayName("실패 ㅠ")
    void createTodoResponseDto() {
        // Given
        Todo todo = new Todo("과제하기", "심화주차 개인과제");
        todo.setId(1L);
        todo.setIsCompleted(false);

        // When
        TodoResponseDTO todoResponseDTO = new TodoResponseDTO(todo);

        // Then
        assertEquals(todo.getId(), todoResponseDTO.getId());
        assertEquals(todo.getTitle(), todoResponseDTO.getTitle());
        assertEquals(todo.getContent(), todoResponseDTO.getContent());
        assertEquals(todo.getIsCompleted(), todoResponseDTO.getIsCompleted());
    }
}
