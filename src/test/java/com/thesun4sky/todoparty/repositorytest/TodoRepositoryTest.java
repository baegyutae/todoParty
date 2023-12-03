package com.thesun4sky.todoparty.repositorytest;

import com.thesun4sky.todoparty.entity.Todo;
import com.thesun4sky.todoparty.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TodoRepositoryTest {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    void saveTodo() {
        // Given
        Todo todo = new Todo("과제 하기", "심화 과제");
        todoRepository.save(todo);

        // When
        Todo foundTodo = todoRepository.findById(todo.getId()).orElse(null);

        // Then
        assertNotNull(foundTodo);
        assertEquals("과제 하기", foundTodo.getTitle());
    }
}