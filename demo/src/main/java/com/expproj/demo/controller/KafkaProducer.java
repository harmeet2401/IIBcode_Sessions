package com.expproj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<Object, Object> template;

    @GetMapping(path = "/send/{what}")
    public void sendFoo(@PathVariable String what) {
        System.out.print("kafk producer -----------");
        this.template.send("topic4", what);
    }
}
