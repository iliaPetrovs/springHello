package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/hello")
@RestController
public class WebController {

    @GetMapping
    public String getHelloWorld() {
        return "Hello World";
    }
}
