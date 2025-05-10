package com.coachingApp.Backend.dto.common;

import lombok.Getter;

@Getter
public class LoginResponse {
    private String id;
    private String userType;
    private String message;
    private String token;

    public LoginResponse(String id, String userType, String message, String token) {
        this.id = id;
        this.userType = userType;
        this.message = message;
        this.token = token;
    }

}

