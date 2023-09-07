package com.aws.spring_study.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aws.spring_study.dto.jsonTestDto;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RespStudyController {

    @GetMapping("/resp/str")
    public String strTest() {
        return "문자열";
    }

    @GetMapping("/resp/obj")
    public Object objectTest() {
        Map<String, Object> responseMap = new HashMap<>();

        return responseMap; // JSON 으로 응답됨
    }
    @GetMapping("/resp/obj2")
    public Object objectTest2() {
        jsonTestDto jsonTestDto = new jsonTestDto();
        jsonTestDto.setName("dbwjd");
        jsonTestDto.setAge(30);
        return jsonTestDto; // JSON으로 응답됨
    }

    @GetMapping("/resp/status")
    public Object statusTest(HttpServletResponse response) {
        response.setStatus(400);
        return null;
    }

    @GetMapping("/resp/resp-entity")
    public ResponseEntity<jsonTestDto> responseEntityTest() {
        jsonTestDto jsonTestDto = new jsonTestDto();
        jsonTestDto.setName("한유정");
        jsonTestDto.setAge(30);
        return new ResponseEntity<jsonTestDto>(jsonTestDto, HttpStatus.UNAUTHORIZED);
    }

    @GetMapping("/resp/resp-map")
    public ResponseEntity<Map<String, Object>> responseEntityTest2() {
        Map<String, Object> map = new HashMap<>();
        map.put("data", "data입니다");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping("/resp")
    public ResponseEntity<jsonTestDto> jsonResponse() {
        jsonTestDto jsonTestDto = new jsonTestDto();
        jsonTestDto.setName("한유정");
        jsonTestDto.setAge(20);
        return ResponseEntity.ok().body(jsonTestDto);
    }


}
