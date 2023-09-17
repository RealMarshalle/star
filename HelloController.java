package com.star.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        //浏览器发生/hello请求，返回"Hello~"
        return "Hello, Spring Boot 3!";
    }
}
