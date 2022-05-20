package com.org.userservice.service;

import com.org.userservice.entity.User;

public interface UserServiceInterface {
    void saveVerificationTokenForUser(String token, User user);
}
