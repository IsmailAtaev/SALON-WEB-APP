package com.salon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstControllers {

    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }


    @GetMapping("/goodbye")
    public String goodByePage() {

        return "first/goodbye";
    }


}
