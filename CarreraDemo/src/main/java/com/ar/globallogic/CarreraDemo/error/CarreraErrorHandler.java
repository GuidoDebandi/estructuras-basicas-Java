package com.ar.globallogic.CarreraDemo.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CarreraErrorHandler {
    ResponseJson respuesta = new ResponseJson();

    @ExceptionHandler({ HttpMessageNotReadableException.class })
    public ResponseEntity<Object> handleHttpMessageNotReadableException() {
        respuesta.setMessage("ERROR MENSAJE MAL FORMADO");
        respuesta.setStatus_code("400");
        respuesta.setUri("/products");
        return new ResponseEntity<Object>(respuesta, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ MethodArgumentNotValidException.class })
    public ResponseEntity<Object> handleMethodArgumentNotValidException() {
        respuesta.setMessage("EROR EN PARAMETROS");
        respuesta.setStatus_code("400");
        respuesta.setUri("/products");
        return new ResponseEntity<Object>(respuesta, HttpStatus.NOT_ACCEPTABLE);
    }

}
