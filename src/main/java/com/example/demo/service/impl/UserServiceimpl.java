package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * Created by ashish on 13/5/17.
 */
@Service
public class UserServiceimpl implements UserService {
	@Override
	public UserDto getUserById(Integer userId) {
		return null;
	}

	@Override
	public void saveUser(UserDto userDto) {

	}

	@Override
	public List<UserDto> getAllUsers() {
		return Collections.emptyList();
	}
}
