package com.github.tizbassar.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloEndpoint {

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello(String name) {
        return "Hello, " + name;
    }
}
