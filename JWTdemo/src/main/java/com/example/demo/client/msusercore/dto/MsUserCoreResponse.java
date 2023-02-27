package com.example.demo.client.msusercore.dto;

import com.example.demo.enums.MsAuthResponseCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class MsUserCoreResponse<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(required = true, description = "Código de respuesta del Ms-User-Core")
    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(required = true, description = "Descripción del código de respuesta del Ms-User-Core")
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public MsUserCoreResponse(Integer responseCode) {
        this.code = responseCode;
    }

    public MsUserCoreResponse(T body, MsAuthResponseCode responseCode) {
        this.setData(body);
        this.setCode(responseCode.label);
        this.setMessage(responseCode.toString());
    }

    public MsUserCoreResponse(Integer code, String message, T body) {
        this.setData(body);
        this.setCode(code);
        this.setMessage(message);
    }
}
