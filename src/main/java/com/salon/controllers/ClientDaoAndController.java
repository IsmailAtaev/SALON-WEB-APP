package com.salon.controllers;

import com.salon.dao.ClientDAO;
import com.salon.dao.UserDAO;
import com.salon.models.client.Client;
import com.salon.models.user.User;

import java.util.List;

public class ClientDaoAndController {

    private ClientDAO clientDAO;
    private UserDAO userDAO;
/*
    public void addClientBdGetUserId(Client client) {
        userDAO.save(new User(client.getUsername(),client.getPassword()));
        List<User> userList = userDAO.index();
        if(userList.isEmpty()) return;
        client.setClientID(userList.get(userList.size()).getUserID());
        System.out.println(userList.get(userList.size()).getUserID());
        clientDAO.save(client);
    }*/
}
