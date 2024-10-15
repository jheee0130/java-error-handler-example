package com.junghee.javaerrorhandlerexample.global.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private ResponseEntity<Object> toResponseEntity(Error error){
        final var responseBody = ApiResponse.fail(error);
        return new ResponseEntity<>(responseBody, error.httpStatus());
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Object> handler(BusinessException e){
        return toResponseEntity(e.getError());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handler(Exception e){
        return toResponseEntity(ErrorCode.UNKNOWN_ERROR);
    }

}
