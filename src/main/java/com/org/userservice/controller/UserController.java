package com.org.userservice.controller;


import com.org.userservice.entity.Role;
import com.org.userservice.entity.User;
import com.org.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Slf4j
@RestController

public class UserController {

    @Autowired
    private UserService userService;

    private final Logger LOGGER =
            LoggerFactory.getLogger(UserController.class);

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/users/{id}")
    public User getUserWithTwitter (@PathVariable("id") String last_visit_id) {
        log.info("Inside getUserWithTwitter of UserController");
        return userService.findUserById(last_visit_id);
    }

    @GetMapping("/users")
    public List<User> fetchUserList() {
        LOGGER.info("Inside fetchUserList of UserController");
        return userService.fetchUserList();
    }

    @GetMapping("/roles")
    public List<Role> fetchRoleList(){
        LOGGER.info("Inside fetchRoleList of UserController");
        return userService.fetchRoleList();
    }


}
