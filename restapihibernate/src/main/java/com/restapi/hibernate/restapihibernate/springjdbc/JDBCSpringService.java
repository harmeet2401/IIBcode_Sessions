package com.restapi.hibernate.restapihibernate.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCSpringService {

    @Autowired
    public JdbcTemplate jdbcTemplate;
    public String query =
            """
                    INSERT INTO USER_DETAILS(id,name,address) VALUES(1,'Simranjeet Singh','Austria');
                    """;
    public void runQuery(){
        jdbcTemplate.update(query);
    }
}
