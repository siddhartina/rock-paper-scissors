package rps.service;

import rps.dto.Choice;
import rps.dto.Move;

public interface RpsService {
    Move humanMove(Choice choice);

    Choice computersChoice();
}
