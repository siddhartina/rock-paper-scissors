package rps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rps.dto.RpsDto;
import rps.service.RpsService;
import rps.utils.Constants;

/**
 * Created by ashish on 13/5/17.
 */
@RequestMapping("/user")
@RestController
public class RpsController {
	@Autowired
	private RpsService rpsService;

	@RequestMapping(Constants.GET_ALL_USERS)
	public List<RpsDto> getAllUsers() {
		return rpsService.getAllUsers();
	}
	
	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public void saveUser(@RequestBody RpsDto rpsDto) {
		rpsService.saveUser(rpsDto);
	}
}
