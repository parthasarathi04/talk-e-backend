package com.chat.talke.controller;

import org.openapitools.api.UserApi;
import org.openapitools.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users/v1")
public class UserController implements UserApi {
    @Override
    public ResponseEntity<User> createUser(User user) {
        return UserApi.super.createUser(user);
    }

    @Override
    public ResponseEntity<User> updateUser(User user) {
        return UserApi.super.updateUser(user);
    }
    @Override
    public ResponseEntity<User> getBuddiesByName(String username) {
        return UserApi.super.getBuddiesByName(username);
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return UserApi.super.getUserByName(username);
    }

}
