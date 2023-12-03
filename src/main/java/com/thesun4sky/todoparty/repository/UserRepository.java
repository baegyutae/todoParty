package com.thesun4sky.todoparty.repository;

import java.util.Optional;

import com.thesun4sky.todoparty.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}
