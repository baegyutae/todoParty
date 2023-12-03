package com.thesun4sky.todoparty.entitytest;

import com.thesun4sky.todoparty.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    @DisplayName("유저 생성")
    void createUser() {
        // Given
        String username = "배규태";
        String password = "1234";

        // When
        User user = new User(username, password);

        // Then
        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());
    }
}
