package com.restapi.hibernate.restapihibernate.springjdbc;

import com.restapi.hibernate.restapihibernate.bean.User_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JDBCSpringService {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    /*public String query =
            """
                    INSERT INTO USER_DETAILS(id,name,address) VALUES(1,'Simranjeet Singh','Austria');
                    """;*/
    public String insertquery =
            """
                    INSERT INTO USER_DETAILS(id,name,address) VALUES(?,?,?);
                    """;

    public String deletequery =
            """
                    DELETE FROM USER_DETAILS WHERE ID = ?;
                    """;
    public String selectquery =
            """
                    SELECT * FROM USER_DETAILS WHERE ID = ?;
                    """;
    public void insert(User_details details){
        jdbcTemplate.update(insertquery,details.getId(),details.getName(),details.getAddress());
    }
    public void delete(long id){
        jdbcTemplate.update(deletequery,id);
    }
    public User_details select(long id){
        User_details user_details = jdbcTemplate.queryForObject(selectquery,new BeanPropertyRowMapper<>(User_details.class),id);
        return  user_details;
    }
}
