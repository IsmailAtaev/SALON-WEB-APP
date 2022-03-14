package com.salon.dao;

import com.salon.models.type_of_service.TypeOfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public class TypeOfServiceDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TypeOfServiceDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<TypeOfService> getTypeOfServiceDB() {
        return jdbcTemplate.query("SELECT * FROM typeofservice", new BeanPropertyRowMapper<>(TypeOfService.class));
    }

}
