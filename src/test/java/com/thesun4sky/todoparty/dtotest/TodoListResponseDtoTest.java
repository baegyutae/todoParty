package com.thesun4sky.todoparty.dtotest;

import com.thesun4sky.todoparty.dto.TodoListResponseDTO;
import com.thesun4sky.todoparty.dto.TodoResponseDTO;
import com.thesun4sky.todoparty.dto.UserDTO;
import com.thesun4sky.todoparty.entity.Todo;
import com.thesun4sky.todoparty.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TodoListResponseDtoTest {
    @Test
    @DisplayName("실패 ㅠ")
    void createTodoListResponseDto() {
        // Given
        UserDTO userDTO = new UserDTO(new User("배규태", "1234"));
        TodoResponseDTO todoResponseDTO = new TodoResponseDTO(new Todo("배규태", "과제 하기"));
        todoResponseDTO.setId(1L);

        // When
        TodoListResponseDTO todoListResponseDTO = new TodoListResponseDTO(userDTO, Collections.singletonList(todoResponseDTO));

        // Then
        assertEquals(userDTO, todoListResponseDTO.getUser());
        assertEquals(todoResponseDTO, todoListResponseDTO.getTodoList().get(0));
    }
}
