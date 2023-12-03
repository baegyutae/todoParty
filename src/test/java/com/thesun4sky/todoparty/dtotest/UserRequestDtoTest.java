package com.thesun4sky.todoparty.dtotest;

import com.thesun4sky.todoparty.dto.UserRequestDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRequestDtoTest {
    @Test
    void createUserRequestDto() {
        // Given
        String username = "배규태";
        String password = "1234";

        // When
        UserRequestDTO userRequestDTO = new UserRequestDTO();
        userRequestDTO.setUsername(username);
        userRequestDTO.setPassword(password);

        // Then
        assertEquals(username, userRequestDTO.getUsername());
        assertEquals(password, userRequestDTO.getPassword());
    }
}
