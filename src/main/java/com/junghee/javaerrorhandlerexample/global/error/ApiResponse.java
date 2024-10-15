package com.junghee.javaerrorhandlerexample.global.error;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public record ApiResponse<T>(
    int resultCode,
    String resultMsg,
    @JsonUnwrapped T content
) {

    private static final int SUCCESS_CODE = 200;
    private static final String SUCCESS_MSG = "OK";

    public static <T> ApiResponse<T> success() {
        return new ApiResponse<>(SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> ApiResponse<T> success(T content) {
        return new ApiResponse<>(SUCCESS_CODE, SUCCESS_MSG, content);
    }

    public static <T> ApiResponse<T> fail(Error error) {
        return new ApiResponse<>(error.httpStatus().value(), error.message(), null);
    }

}
