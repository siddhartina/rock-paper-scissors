package rps.service;

import java.util.List;

import rps.dto.Choice;
import rps.dto.ComputersChoiceDto;
import rps.dto.RpsDto;

public interface RpsService {
    ComputersChoiceDto handShown(Choice choice);
    List<RpsDto> getAllUsers();
}
