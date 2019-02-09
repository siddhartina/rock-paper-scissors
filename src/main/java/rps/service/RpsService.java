package rps.service;

import rps.dto.Choice;
import rps.dto.ComputersChoiceDto;

public interface RpsService {
    ComputersChoiceDto handShown(Choice choice);
}
