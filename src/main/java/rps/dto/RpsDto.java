package rps.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashish on 13/5/17.
 */
public class RpsDto {
    private Integer userId;
    private String userName;

    public RpsDto(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public RpsDto() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
