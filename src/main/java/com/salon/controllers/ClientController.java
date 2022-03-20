package com.salon.controllers;

import com.salon.dao.ClientDAO;
import com.salon.models.client.Client;
import com.salon.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

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
        return "client/new";
    }

    @PostMapping()
    public String createClient(@ModelAttribute("client") Client client) {
        clientDAO.saveUser(new User(client.getUsername(), client.getPassword()));
        List<User> list = clientDAO.getUserDB();
        client.setClientID(list.get(list.size() - 1).getUserID());
        clientDAO.save(client);
        return "redirect:/client";
    }
}