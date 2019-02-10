package rps.service;

import rps.dto.Choice;
import rps.dto.Move;
import rps.dto.Result;

public interface RpsService {

    Choice computersChoice();

    Result computeResult(Choice humanChoice, Choice computersChoice);
}
