package rps.service;

import java.util.List;

import rps.dto.RpsDto;

/**
 * Created by ashish on 13/5/17.
 */
public interface RpsService {
    void handShown(String choice);
    List<RpsDto> getAllUsers();
}
