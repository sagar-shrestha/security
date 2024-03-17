package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ru")
public class NewController {

    @GetMapping("/getnew")
    public String getNew() {
        return "working...";
    }
}
