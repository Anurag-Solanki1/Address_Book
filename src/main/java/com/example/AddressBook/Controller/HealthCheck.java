package com.example.AddressBook.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheck {
    @RequestMapping
    public String healthCheck() {
        return "{\"status\": \"UP\"}";
    }
}
