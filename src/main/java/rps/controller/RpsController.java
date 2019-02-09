package rps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import rps.dto.Choice;
import rps.dto.ComputersChoiceDto;
import rps.service.RpsService;
import rps.utils.Constants;

@RequestMapping("/rps")
@RestController
public class RpsController {
	@Autowired
	private RpsService rpsService;

	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public ComputersChoiceDto handShown(@RequestParam(name="choice") Choice choice) {
		return rpsService.handShown(choice);
	}
}
