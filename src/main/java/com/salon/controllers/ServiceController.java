package com.salon.controllers;

import com.salon.dao.ServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ServiceController {

    private final ServiceDAO serviceDAO;

    @Autowired
    public ServiceController(ServiceDAO serviceDAO) {
        this.serviceDAO = serviceDAO;
    }

    @GetMapping("/src")
    public String showServices(Model model) {
        model.addAttribute("people", serviceDAO.getServices());
        return "/html/service/service";
    }




}