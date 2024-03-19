package com.orielly.jpapersistence.jpamicroservice.daoservice;

import com.orielly.jpapersistence.jpamicroservice.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDAOJdbcTemplate implements DbFunction{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Customer> findAll() {
        List<Customer> customerEntities =
                jdbcTemplate.query("SELECT * FROM CUSTOMER",
                        (rs, rowNum) ->
                        new Customer(rs.getInt("ID"), rs.getString("FIRST_NAME"), rs.getString("LAST_NAME")
                                , rs.getString("ADDRESS")));
        return customerEntities;



    }

    @Override
    public Customer findById(Integer id) {
        Object customerEntities =
                jdbcTemplate.queryForObject("SELECT * FROM CUSTOMER WHERE id=?",
                        (rs, rowNum) -> new Customer(rs.getInt("ID"),
                                rs.getString("FIRST_NAME"),
                                rs.getString("LAST_NAME"),
                                rs.getString("ADDRESS")) , id);
        return (Customer) customerEntities;
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void save(Customer customer) {

    }
}
