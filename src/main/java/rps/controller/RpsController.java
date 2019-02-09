package rps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import rps.dto.Choice;
import rps.dto.ComputersChoiceDto;
import rps.dto.RpsDto;
import rps.service.RpsService;
import rps.utils.Constants;

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
	public ComputersChoiceDto handShown(@RequestParam(name="choice") Choice choice) {
		return rpsService.handShown(choice);
	}
}
