package com.spring.jwt.exception;

public class RequestAlreadyActiveException extends RuntimeException {

    public RequestAlreadyActiveException(String message) {
        super(message);
    }
}
