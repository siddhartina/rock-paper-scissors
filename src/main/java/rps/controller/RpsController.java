package rps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rps.dto.UserDto;
import rps.service.UserService;
import rps.utils.Constants;

/**
 * Created by ashish on 13/5/17.
 */
@RequestMapping("/user")
@RestController
public class RpsController {
	@Autowired
	private UserService userService;

	@RequestMapping(Constants.GET_ALL_USERS)
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public void saveUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
	}
}
