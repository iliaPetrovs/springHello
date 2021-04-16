package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping(value={"/hello"}, produces = MediaType.APPLICATION_JSON_VALUE)
    String sayHello() {
        return("{\"message\":\"hello there\"}");
    }

}