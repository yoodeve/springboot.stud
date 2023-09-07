package com.aws.spring_study.controller;

import com.aws.spring_study.dto.jsonTestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutController {
    @PutMapping("/put/json")
    public Object json(@RequestBody jsonTestDto jsonTestDto) {
        System.out.println(jsonTestDto);
        return null;
    }
}
