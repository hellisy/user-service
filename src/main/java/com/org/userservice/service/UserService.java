package com.org.userservice.service;

import com.org.userservice.VO.ResponseTemplateVO;
import com.org.userservice.VO.Twitter;
import com.org.userservice.entity.Role;
import com.org.userservice.entity.User;
import com.org.userservice.repository.RoleRepository;
import com.org.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;




    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }



    public User findUserById(String last_visit_id){
        log.info("Inside saveUser of UserService");
        return userRepository.findByUserId(last_visit_id);
    }



    public List<User> fetchUserList() {
        return userRepository.findAll();

    }

    public List<Role> fetchRoleList() {
        return roleRepository.findAll();
    }


    public void saveVerificationTokenForUser(String token, User user) {
    }
}


