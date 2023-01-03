package com.in28minutes.rest.webservices.restfullservice.exceptionhanlders;

import com.in28minutes.rest.webservices.restfullservice.bean.CustomExceptionBean;
import org.apache.catalina.util.CustomObjectInputStream;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<CustomExceptionBean> handleAllException(Exception ex, WebRequest request) throws Exception {

        return new ResponseEntity<CustomExceptionBean>(new CustomExceptionBean(ex.getMessage(),LocalDateTime.now(), request.getSessionId()),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }
    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<CustomExceptionBean> UserNotFoundException(Exception ex, WebRequest request) throws Exception {

        return new ResponseEntity<CustomExceptionBean>(new CustomExceptionBean(ex.getMessage(),LocalDateTime.now(),request.getSessionId()),
                HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(UserNotCreatedException.class)
    public final ResponseEntity<CustomExceptionBean> UserNotCreatedException(Exception ex, WebRequest request) throws Exception {

        return new ResponseEntity<CustomExceptionBean>(new CustomExceptionBean(ex.getMessage(),LocalDateTime.now(),request.getSessionId()),
                HttpStatus.BAD_REQUEST);

    }

    @Override
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        return new ResponseEntity<Object>(new CustomExceptionBean("Total Errors : " +
                ex.getErrorCount() +"  First Error :"+ex.getFieldError().getDefaultMessage(),
                LocalDateTime.now(),
                request.getDescription(false)),
                HttpStatus.BAD_REQUEST);
    }
}
