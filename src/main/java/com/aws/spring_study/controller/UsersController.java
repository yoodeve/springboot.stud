package com.aws.spring_study.controller;

import com.aws.spring_study.dto.RegisterUserReqDto;
import com.aws.spring_study.repository.UserMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {
// test
    @Autowired
    private UserMappers userMappers;

    @CrossOrigin
    @PostMapping("/user")
    public ResponseEntity<?> registerUser(@RequestBody RegisterUserReqDto registerUserReqDto) {
        System.out.println(registerUserReqDto);
        Integer count = userMappers.saveUser(registerUserReqDto);
        return ResponseEntity.ok().body(count);
    }
}
