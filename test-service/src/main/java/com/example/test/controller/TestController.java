package com.example.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController("/test")
@Slf4j
public class TestController {
    @GetMapping
    public String testService(HttpServletRequest request) {
        log.info("I am " + request.getRequestURL().toString());
        return request.getRequestURL().toString();
    }

}
