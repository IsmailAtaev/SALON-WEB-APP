package com.salon.controllers;

import com.salon.dao.MasterDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasterController {

    private final MasterDAO masterDAO;

    @Autowired
    public MasterController(MasterDAO masterDAO) {
        this.masterDAO = masterDAO;
    }

    @GetMapping("master")
    public String showMasters(Model model) {
        model.addAttribute("people", masterDAO.getMastersDB());
        System.out.println(masterDAO.getMastersDB());
        return "html/master/master";
    }
}