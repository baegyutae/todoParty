package com.thesun4sky.todoparty.security;

import com.thesun4sky.todoparty.entity.User;
import com.thesun4sky.todoparty.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailsService {

	private final UserRepository userRepository;

	public UserDetailsImpl getUserDetails(String username) {
		User user = userRepository.findByUsername(username)
			.orElseThrow(() -> new UsernameNotFoundException("Not Found" + username));
		return new UserDetailsImpl(user);
	}

}
