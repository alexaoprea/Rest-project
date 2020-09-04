package com.alexandra.restproject2.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    String hello(){
        return "Hello";
    }

    @PostMapping("/goodbye")
    String goodbye(){
        return "Goodbye";
    }

    @DeleteMapping("/holiday")
    String holiday(){
        return "Out of office";
    }
}
