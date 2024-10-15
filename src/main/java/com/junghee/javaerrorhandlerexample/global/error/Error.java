package com.junghee.javaerrorhandlerexample.global.error;


import org.springframework.http.HttpStatus;

public interface Error {

    String key();

    String message();

    HttpStatus httpStatus();

}
