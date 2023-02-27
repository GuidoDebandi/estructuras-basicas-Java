package com.example.demo.dto;

import com.example.demo.enums.MsAuthResponseCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class MsAuthResponse<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(required = true, description = "Código de respuesta del Ms-user-core")
    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(required = true, description = "Descripción del código de respuesta del Ms-user-core")
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public MsAuthResponse( Integer responseCode) {
        this.code = responseCode;
    }

    public MsAuthResponse( T body, MsAuthResponseCode responseCode) {
        this.setData(body);
        this.setCode(responseCode.label);
        this.setMessage(responseCode.toString());
    }

    public MsAuthResponse( Integer code, String message, T body) {
        this.setData(body);
        this.setCode(code);
        this.setMessage(message);
    }
}
