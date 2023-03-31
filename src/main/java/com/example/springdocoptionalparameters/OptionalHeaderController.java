package com.example.springdocoptionalparameters;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OptionalHeaderController {
    @GetMapping("/header")
    public Greeting greet(@RequestHeader(required = false) @Parameter(required = false) final String name) {
        return new Greeting(name);
    }
}
