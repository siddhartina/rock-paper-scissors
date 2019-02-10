package rps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import rps.dto.Choice;
import rps.dto.Move;
import rps.dto.Result;
import rps.service.RpsService;

@RequestMapping("/rps")
@RestController
public class RpsController {
	@Autowired
	private RpsService rpsService;

	@RequestMapping(value="/humanChoice", method= RequestMethod.POST)
	public Move humanChoice(@RequestParam(name="choice") Choice humanChoice) {
		Choice computersChoice = rpsService.computersChoice();
		Result result = rpsService.computeResult(humanChoice, computersChoice);
		return new Move(computersChoice, result);
	}
}
