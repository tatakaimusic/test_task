package com.example.test_task.web.controller;

import com.example.test_task.service.StringService;
import com.example.test_task.web.dto.StringRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/api/string")
@Validated
public class StringController {

    private final StringService stringService;

    @Autowired
    public StringController(StringService service) {
        this.stringService = service;
    }

    /**
     * Get frequency of occurrence of characters in a given string.
     * String must consist only lower case characters,
     * otherwise MethodArgumentNotValidException will be thrown and handled in controller advice.
     * @param request
     * @return Map<Character, Integer>
     */
    @GetMapping("/frequency")
    public Map<Character, Integer> getFrequency(
            @Validated @RequestBody StringRequest request
    ) {
        return stringService.getFrequency(request.getString());
    }

}
