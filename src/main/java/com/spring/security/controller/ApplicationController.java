package com.spring.security.controller;

import com.spring.security.model.User;
import com.spring.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApplicationController {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;




   // @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("/add")
    public String addUserByAdmin(@RequestBody User user) {
        String password = user.getPassword();
        String encodePassword = passwordEncoder.encode(password);
        user.setPassword(encodePassword);
        userRepository.save(user);
        return "Hello Text";
    }

    @GetMapping("/get")
    public String get(){
        return "hello";
    }
}
