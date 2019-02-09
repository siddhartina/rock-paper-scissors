package rps.service.impl;

import rps.dto.UserDto;
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
	public void saveUser(UserDto userDto) {

	}

	@Override
	public List<UserDto> getAllUsers() {
		return Collections.emptyList();
	}
}
