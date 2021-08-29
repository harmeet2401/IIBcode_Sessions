package com.in28minutes.microservices.currencyconversion.controller;

import com.in28minutes.microservices.currencyconversion.bean.CurrencyConversion;
import com.in28minutes.microservices.currencyconversion.configs.Config;
import com.in28minutes.microservices.currencyconversion.proxy.CurrencyExchangeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

@RestController
public class CurrencyConversionController {

    @Autowired
    CurrencyExchangeProxy currencyExchangeProxy;
    @Autowired
    Config config;
    @GetMapping(path = "/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion getConversionDetails(@PathVariable String from,
                                                   @PathVariable String to,
                                                   @PathVariable BigDecimal quantity){

        // now we will calling the currency - exchange service using resttemplate
        HashMap<String,String> uriVariables = new HashMap<>();
        uriVariables.put("from",from);
        uriVariables.put("to",to);
            ResponseEntity<CurrencyConversion> forEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class,
                    uriVariables);
        CurrencyConversion currencyConversion = forEntity.getBody();
        return  new CurrencyConversion(1001L,from,to,quantity, currencyConversion.getConversionMultiple(),
                quantity.multiply(currencyConversion.getConversionMultiple()),currencyConversion.getEnvironment()+"-"+"rest template");
    }

    @GetMapping(path = "/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion getConversionDetailsfeign(@PathVariable String from,
                                                   @PathVariable String to,
                                                   @PathVariable BigDecimal quantity){
        CurrencyConversion currencyConversion = currencyExchangeProxy.getExchangeValueProxy(from, to);
        return  new CurrencyConversion(1001L,from,to,quantity, currencyConversion.getConversionMultiple(),
                quantity.multiply(currencyConversion.getConversionMultiple()),currencyConversion.getEnvironment() +"-"+"feign");
    }
}