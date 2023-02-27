package com.example.demo.exception;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = false)
public abstract class MsAuthException extends RuntimeException{
    @Schema(required = true, description = "Código de error del ms-auth-validations")
    protected int errorCode;

    @Schema(required = true, description = "Status de error del ms-auth-validations")
    private HttpStatus httpStatus;

    private Object[] parameters;

    protected MsAuthException() {
        super();
    }

    protected MsAuthException( String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }


    protected MsAuthException( String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    protected MsAuthException( String message) {
        super(message);
    }

    public abstract String getSysCode();
}
