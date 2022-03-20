package com.salon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/salon")
    public String mainIndex() {
        return "index";
    }





}
