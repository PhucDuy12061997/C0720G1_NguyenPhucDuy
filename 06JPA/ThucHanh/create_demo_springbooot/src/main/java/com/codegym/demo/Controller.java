package com.codegym.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String gohome(){
        return "home";
    }
}
