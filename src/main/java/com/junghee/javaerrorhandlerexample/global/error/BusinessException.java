package com.junghee.javaerrorhandlerexample.global.error;


import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private final Error error;

    public BusinessException(ErrorCode error) {
        super(error.key(), new Throwable(error.message()));
        this.error = error;
    }

    public Error getError() {
        return error;
    }

}
