package com.spring.jwt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class B2BNotFoundResponse {

    private String error;
    private String message;
}
