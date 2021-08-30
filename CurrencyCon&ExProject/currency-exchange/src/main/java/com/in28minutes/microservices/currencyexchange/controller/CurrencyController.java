package com.in28minutes.microservices.currencyexchange.controller;

import com.in28minutes.microservices.currencyexchange.bean.CurrencyExchange;
import com.in28minutes.microservices.currencyexchange.configs.Config;
import com.in28minutes.microservices.currencyexchange.services.CurrencyExJpaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyController {

    Logger log = LoggerFactory.getLogger(CurrencyController.class);
    @Autowired
    Config config;
    @Autowired
    CurrencyExJpaService currencyExJpaService;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getExchangeValue(@PathVariable String from,
                                             @PathVariable String to
                                             ){
        CurrencyExchange currencyExchange = currencyExJpaService.findByFromAndTo(from,to);
        log.info("!!!!Executing the curr exchange!!!!!");
        if(currencyExchange==null){
            throw new RuntimeException("Unable to find the data");
        }
        currencyExchange.setEnvironment(config.serverport);
        return currencyExchange;
    }

}
