package com.salon.controllers;

import com.salon.dao.UserDAO;
import com.salon.models.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    private final  UserDAO userDAO;

    public IndexController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping("salon")
    public String indexPage() {
        userDAO.index();
        return "index";
    }

}