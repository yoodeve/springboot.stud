package com.aws.spring_study.controller;

import com.aws.spring_study.dto.jsonTestDto;
import com.aws.spring_study.dto.xWwwTestDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @PostMapping("/post/xwww")
    public Object xWwwFormUrlEncoded(xWwwTestDto xWwwTestDto) {
        System.out.println(xWwwTestDto);
        return null;
    }

    @PostMapping("post/json")
    public Object json(@RequestBody jsonTestDto jsonTestDto) {
        System.out.println(jsonTestDto);
        return null;
    }

}
