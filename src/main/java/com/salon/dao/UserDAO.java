package com.salon.dao;

import com.salon.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> index() {
        return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
    }

    public void save(User user) {
        jdbcTemplate.update("INSERT INTO users (username, password) VALUES(?, ?)", user.getUsername(), user.getPassword());
    }

    public User show(int id) {
        return jdbcTemplate.query("SELECT * FROM users WHERE id=?", new Object[]{id}, new BeanPropertyRowMapper<>(User.class)).stream().findAny().orElse(null);
    }

    public User showUserPass(String pass) {
        return jdbcTemplate.query("SELECT * FROM users WHERE password=?", new Object[]{pass}, new BeanPropertyRowMapper<>(User.class)).stream().findAny().orElse(null);
    }





}