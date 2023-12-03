package com.thesun4sky.todoparty.dtotest;

import com.thesun4sky.todoparty.dto.UserDTO;
import com.thesun4sky.todoparty.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserDtoTest {
    @Test
    @DisplayName("유저 생성")
    void createUserDto() {
        // Given
        String expectedUsername = "배규태";
        User user = new User(expectedUsername, "1234");

        // When
        UserDTO userDTO = new UserDTO(user);

        // Then
        assertEquals(expectedUsername, userDTO.getUsername());
    }
}
