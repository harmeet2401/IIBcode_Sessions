package com.in28minutes.microservices.currencyexchange.services;


import com.in28minutes.microservices.currencyexchange.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * This interface works as a DOA service  to fetch all the data from h2 in-memory DB.
 * JPA is the bridge between the java object model and the databases.
 */
@Repository
public interface CurrencyExJpaService extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from , String to);
}
