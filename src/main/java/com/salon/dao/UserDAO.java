package com.salon.dao;

import com.salon.dao.mapper.UserMapper;
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
        List<User> list = jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<>(User.class));
        System.out.println(list.toString());
        return null;
    }
}
//UserMapper());