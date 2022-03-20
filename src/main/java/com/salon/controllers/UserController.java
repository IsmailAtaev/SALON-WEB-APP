package com.salon.controllers;

import com.salon.dao.UserDAO;
import com.salon.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserDAO userDAO;

    @Autowired
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("people", userDAO.index());
        return "user/index";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("users", new User());
        return "user/new";
    }

    @PostMapping()
    public String createUser(@ModelAttribute("user") User user) {
        userDAO.save(user);
        return "redirect:/user";
    }

    @GetMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String pass) {

        return "user/index";
    }
/*
    @PostMapping()
    public String loginUser(@ModelAttribute("userLog") User user) {
        System.out.println(user.getPassword());
        // User user1 = userDAO.showUserPass(user.getPassword());
        // System.out.println(user1.toString());
        return "redirect:/salon";
    }*/
}

