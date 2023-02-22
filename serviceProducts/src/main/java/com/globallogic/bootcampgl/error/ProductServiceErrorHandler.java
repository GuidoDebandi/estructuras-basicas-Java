package com.globallogic.bootcampgl.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceErrorHandler {
    
    @ExceptionHandler({Exception.class,HttpMessageNotReadableException.class})
    public ResponseEntity<Object> handleHttpMessageNotRedableException() {
        return new ResponseEntity<Object>("ERROR MENSAJE MAL FORMADO",HttpStatus.BAD_REQUEST);
    }
}
