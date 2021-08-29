package com.in28minutes.microservices.currencyexchange.controller;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CirtcuitBreakerController {

    Logger log = LoggerFactory.getLogger(CirtcuitBreakerController.class);
    @GetMapping("/sample-api")
    //@Retry(name = "sample-api",fallbackMethod = "hardcodedvalue")
   // @CircuitBreaker(name = "default",fallbackMethod = "hardcodedvalue")
    //@RateLimiter(name = "default")
    @Bulkhead(name = "default")
    public String getmap(){
        log.info("!!!!!Sample api called!!!!!");
        ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://lcalhost:8099/dummy", String.class);
        return  forEntity.getBody();
    }

    public String hardcodedvalue(Exception ex){
        return "Fall back function called";
    }
}
