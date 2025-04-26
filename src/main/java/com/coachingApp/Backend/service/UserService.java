package com.coachingApp.Backend.service;

import com.coachingApp.Backend.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUser();

    User getUserById(String userId);

    User updateUser(User user);

    boolean existUser(String userId);
}
