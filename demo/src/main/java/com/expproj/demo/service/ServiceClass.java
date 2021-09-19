package com.expproj.demo.service;

import com.expproj.demo.bean.userBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicReference;

@Service
public class ServiceClass {
    String BASE = "http://localhost:8080";
    String operation = "/user";

    RestTemplate restTemplate; // Now to create an instance of restTemplate we need to use RestTemplateBuilder which will autowire the instance of it.

    @Autowired
    public ServiceClass(RestTemplateBuilder builder) {

        restTemplate = builder.build();
    }
    public userBean getUserUsingHttphit(){
       /* final AtomicReference<Message> message = new AtomicReference<>();

        jmsTemplate.convertAndSend("199", messagePostProcessor -> {
                message.set(messagePostProcessor);
            return messagePostProcessor;
        });*/
        new JmsTemplate().convertAndSend("");
        return  restTemplate.getForObject(String.format("%s%s", BASE, operation),userBean.class);
        //or
        //return  new RestTemplate().getForObject(String.format("%s%s", BASE, operation),userBean.class);
    }

}
