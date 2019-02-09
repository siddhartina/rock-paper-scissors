package rps.service.impl;

import org.slf4j.LoggerFactory;
import rps.dto.Choice;
import rps.dto.ComputersChoiceDto;
import rps.dto.RpsDto;
import rps.service.RpsService;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RpsServiceImpl implements RpsService {
	@Override
	public ComputersChoiceDto handShown(Choice choice) {
		LoggerFactory.getLogger(RpsServiceImpl.class).info("Entered handShown(" + choice + ")");
		return new ComputersChoiceDto(Choice.randomChoice());
	}

	@Override
	public List<RpsDto> getAllUsers() {
		return Collections.singletonList(new RpsDto(5, "Tom"));
	}
}
