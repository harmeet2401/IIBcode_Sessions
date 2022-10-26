package com.in28minutes.rest.webservices.restfullservice.bean;

import java.time.LocalDateTime;

public class CustomExceptionBean {
    private String message;
    private LocalDateTime time;
    private String detail;
    public CustomExceptionBean(){

    }
    public CustomExceptionBean(String message, LocalDateTime time, String detail) {
        this.message = message;
        this.time = time;
        this.detail = detail;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getDetail() {
        return detail;
    }
}
