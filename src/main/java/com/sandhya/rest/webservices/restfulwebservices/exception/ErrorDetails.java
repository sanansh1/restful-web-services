package com.sandhya.rest.webservices.restfulwebservices.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
public class ErrorDetails {
    private LocalDateTime time;
    private String message;
    private String description;
}
