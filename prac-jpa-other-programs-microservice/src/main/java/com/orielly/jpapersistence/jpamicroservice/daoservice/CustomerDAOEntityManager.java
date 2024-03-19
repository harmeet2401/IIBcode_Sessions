package com.orielly.jpapersistence.jpamicroservice.daoservice;

import com.orielly.jpapersistence.jpamicroservice.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerDAOEntityManager implements DbFunction{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Customer> findAll() {
        return entityManager.createQuery("SELECT * FROM CUSTOMER",Customer.class).getResultList();
    }

    @Override
    public Customer findById(Integer id) {
        return entityManager.find(Customer.class,id);
    }

    @Override
    public void delete(Customer customer) {
        entityManager.remove(customer);
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void save(Customer customer) {
        entityManager.persist(customer);
    }
}
