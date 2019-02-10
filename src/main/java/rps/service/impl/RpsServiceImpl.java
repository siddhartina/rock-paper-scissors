package rps.service.impl;

import rps.dto.Choice;
import rps.dto.Move;
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
}
