package com.thesun4sky.todoparty.dto;

import com.thesun4sky.todoparty.entity.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class UserDTO {
	private String username;

	public UserDTO(User user) {
		this.username = user.getUsername();
	}
}
