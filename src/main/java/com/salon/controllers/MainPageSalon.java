package com.salon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageSalon {

    @GetMapping("/salon")
    public String indexPage() {
        return "index";
    }

}