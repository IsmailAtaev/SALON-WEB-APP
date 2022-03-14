package com.salon.controllers;

import com.salon.dao.TypeOfServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TypeOfServiceController {

    private final TypeOfServiceDAO typeOfServiceDAO;

    @Autowired
    public TypeOfServiceController(TypeOfServiceDAO typeOfServiceDAO) {
        this.typeOfServiceDAO = typeOfServiceDAO;
    }

    @GetMapping("/type")
    public String showTypeOfService(Model model) {
        model.addAttribute("people", typeOfServiceDAO.getTypeOfServiceDB());
        System.out.println(typeOfServiceDAO.getTypeOfServiceDB());
        return "html/master/type";
    }

}
