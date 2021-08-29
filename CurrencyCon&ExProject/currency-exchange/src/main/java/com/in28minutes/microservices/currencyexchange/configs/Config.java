package com.in28minutes.microservices.currencyexchange.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Value("${server.port}")
    public String serverport;

    protected Config(){

    }
    public String getServerport() {
        return serverport;
    }

    public void setServerport(String serverport) {
        this.serverport = serverport;
    }
}
