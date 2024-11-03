package com.hotel_management_system.hotel_management_system.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RequestException extends RuntimeException {
    public RequestException(String message) {
        super(message);
    }
    public RequestException(String message, Throwable cause) {
        super(message, cause);
    }
}