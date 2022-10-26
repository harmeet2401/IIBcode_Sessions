package com.in28minutes.rest.webservices.restfullservice.bean;

public class HelloworldBean {
    private String message;
    public  HelloworldBean(String hello_world_bean) {
        this.message = hello_world_bean;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Hello worldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
