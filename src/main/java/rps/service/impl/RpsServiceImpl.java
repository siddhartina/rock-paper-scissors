package rps.service.impl;

import org.slf4j.LoggerFactory;
import rps.dto.Choice;
import rps.dto.ComputersChoiceDto;
import rps.service.RpsService;

import org.springframework.stereotype.Service;

@Service
public class RpsServiceImpl implements RpsService {
	@Override
	public ComputersChoiceDto handShown(Choice choice) {
		LoggerFactory.getLogger(RpsServiceImpl.class).info("Entered handShown(" + choice + ")");
		return new ComputersChoiceDto(Choice.randomChoice());
	}
}
