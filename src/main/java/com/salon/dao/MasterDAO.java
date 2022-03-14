package com.salon.dao;

import com.salon.models.master.Master;
import com.salon.models.type_of_service.TypeOfService;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.util.List;


@Component
public class MasterDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MasterDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Master> getMastersDB() {
        return jdbcTemplate.query("SELECT * FROM masters", new BeanPropertyRowMapper<>(Master.class));
    }

    public List<TypeOfService> getTypeOfServiceDB() {
        return jdbcTemplate.query("SELECT * FROM typeofservice", new BeanPropertyRowMapper<>(TypeOfService.class));
    }


}
