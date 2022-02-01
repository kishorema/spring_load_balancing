package com.example.test.controller;

import com.example.test.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("users")
@Slf4j
public class TestController {
    @GetMapping(path="/ping")
    public String testService(HttpServletRequest request) {
        log.info("I am " + request.getRequestURL().toString());
        return request.getRequestURL().toString();
    }

    @GetMapping(path = "/book/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Book getBook(@PathVariable int id) {
        Book book = new Book();
        book.setId(id);
        book.setTitle("Spring 5 Guide");
        return book;
    }
}
