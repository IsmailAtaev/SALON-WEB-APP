package com.salon.dao;


import com.salon.models.client.Client;
import com.salon.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ClientDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ClientDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Client> getClientsDB() {
        return jdbcTemplate.query("SELECT * FROM client", new BeanPropertyRowMapper<>(Client.class));
    }

    public void save(Client client) {
        jdbcTemplate.update("INSERT INTO client VALUES(?, ?, ?, ?)",
                client.getClientID(), client.getName(), client.getBirthDate(), client.getSex());
    }

    public void saveUser(User user) {
        jdbcTemplate.update("INSERT INTO users (username, password) VALUES(?, ?)", user.getUsername(), user.getPassword());
    }

    public List<User> getUserDB() {
        return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
    }

}