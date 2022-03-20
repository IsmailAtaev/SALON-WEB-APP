package com.salon.dao;

import com.salon.models.client.Client;
import com.salon.models.master.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppointmentDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AppointmentDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Client> getClientsDB() {
        return jdbcTemplate.query("SELECT * FROM client", new BeanPropertyRowMapper<>(Client.class));
    }
    public List<Master> getMastersDB() {
        return jdbcTemplate.query("SELECT * FROM masters", new BeanPropertyRowMapper<>(Master.class));
    }
}