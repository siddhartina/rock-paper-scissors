package rps.service.impl;

import rps.dto.RpsDto;
import rps.service.RpsService;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * Created by ashish on 13/5/17.
 */
@Service
public class RpsServiceImpl implements RpsService {
	@Override
	public void handShown(RpsDto rpsDto) {

	}

	@Override
	public List<RpsDto> getAllUsers() {
		return Collections.singletonList(new RpsDto(5, "Tom"));
	}
}
