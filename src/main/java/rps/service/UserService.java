package rps.service;

import java.util.List;

import rps.dto.UserDto;

/**
 * Created by ashish on 13/5/17.
 */
public interface UserService {
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
