package com.salon.dao;

import com.salon.models.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class ServiceDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ServiceDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Service> getServices() {
        return jdbcTemplate.query("SELECT * FROM services", new BeanPropertyRowMapper<>(Service.class));
    }
}
