package rps.service.impl;

import rps.dto.Choice;
import rps.dto.Move;
import rps.dto.Result;
import rps.service.RpsService;

import org.springframework.stereotype.Service;

@Service
public class RpsServiceImpl implements RpsService {
	@Override
	public Move humanMove(Choice choice) {
		return new Move(Choice.randomChoice());
	}

	@Override
	public Choice computersChoice() {
		return Choice.randomChoice();
	}

	@Override
	public Result computeResult(Choice humanChoice, Choice computersChoice) {
		if (humanChoice == computersChoice)
			return Result.TIE;
		else if (humanChoice.beats(computersChoice))
			return Result.HUMAN_WINS;
		else
			return Result.COMPUTER_WINS;
	}
}
