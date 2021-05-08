package com.techinterface.service.impl;

import com.techinterface.model.User;
import com.techinterface.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User getUserById(String userid) {
        User user = new User();
        user.setFirstname("TestUser");
        user.setLastname("Vim");
        user.setLocation("Bangalore");
        user.setPincode("560402");
        user.setCountrycode("IN");
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        User user = new User();
        user.setFirstname("TestUser");
        return Collections.singletonList(user);
    }

    @Override
    public String deleteUserById(String userid) {
        return "Deleted Successfully";
    }

    @Override
    public User saveUser(User user) {
        return user;
    }
}
