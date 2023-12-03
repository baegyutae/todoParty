package com.thesun4sky.todoparty.repositorytest;

import com.thesun4sky.todoparty.entity.User;
import com.thesun4sky.todoparty.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByUsername() {
        // Given
        String username = "배규태";
        String password = "1234";
        User user = new User(username, password);
        userRepository.save(user);

        // When
        Optional<User> foundUser = userRepository.findByUsername(username);

        // Then
        assertTrue(foundUser.isPresent());
        assertEquals(username, foundUser.get().getUsername());
    }
}
