package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;

/**
 * Created by ashish on 13/5/17.
 */
public interface UserService {
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
