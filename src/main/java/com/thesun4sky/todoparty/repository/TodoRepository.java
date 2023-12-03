package com.thesun4sky.todoparty.repository;

import com.thesun4sky.todoparty.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
