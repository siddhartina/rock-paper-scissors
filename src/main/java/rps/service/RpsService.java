package rps.service;

import java.util.List;

import rps.dto.Choice;
import rps.dto.RpsDto;

public interface RpsService {
    void handShown(Choice choice);
    List<RpsDto> getAllUsers();
}
