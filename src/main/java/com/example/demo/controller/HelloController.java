package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/test")
    public String test() {
        test1();
        return "Hello World";
    }

    public void test1() {
        int i = 500;
        int j = i + 1;
        System.out.println(1 + 1);
    }
}
