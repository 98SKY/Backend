package com.coachingApp.Backend.dto.common;

public class LoginResponse {
    private String id;
    private String userType;
    private String message;

    public LoginResponse(String id, String userType, String message, String token) {
        this.id = id;
        this.userType = userType;
        this.message = message;
    }

}

