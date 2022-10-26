package com.in28minutes.rest.webservices.restfullservice.exceptionhanlders;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserNotCreatedException extends RuntimeException {
    public UserNotCreatedException(String s) {
        super(s);
    }
}
