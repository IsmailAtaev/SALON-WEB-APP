package com.salon.controllers;

import com.salon.dao.ClientDAO;
import com.salon.models.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {

    private final ClientDAO clientDAO;

    @Autowired
    public ClientController(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("people", clientDAO.getClientsDB());
        return "client/index";
    }

    @GetMapping("/new")
    public String newCln(Model model) {
        model.addAttribute("clients", new Client());
        System.out.println("get map");
        return "client/new";
    }

    @PostMapping()
    public String createClient(@ModelAttribute("client") Client client) {
        System.out.println(client.toString());
        return "redirect:/client";
    }
}