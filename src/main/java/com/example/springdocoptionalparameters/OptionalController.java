package com.example.springdocoptionalparameters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OptionalController {
    @GetMapping("/")
    public Greeting greet(@RequestParam(required = false) final String name) {
        return new Greeting(name);
    }
}

record Greeting(String name) {}