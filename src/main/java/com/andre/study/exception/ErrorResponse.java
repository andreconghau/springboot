package com.andre.study.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.net.HttpCookie;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ErrorResponse {

    private HttpStatus httpStatus;

    private String message;
}
