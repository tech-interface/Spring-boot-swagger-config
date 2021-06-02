package com.techinterface.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilesTestingController {
    Logger logger = LoggerFactory.getLogger(ProfilesTestingController.class);

    @Value("${spring.profile-testing-key}")
    private String key;

    @GetMapping("/loadProfile")
    public String  getData(){
        return key;
    }


}
