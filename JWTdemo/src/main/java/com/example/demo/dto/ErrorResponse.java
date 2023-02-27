package com.example.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    @Schema(required = true, description = "Status de error del servicio")
    private String status;

    @Schema(required = true, description = "Código de error del servicio")
    private String code;

    @Schema(required = true, description = "Subtipo de error del servicio")
    private String subType;

    @Schema(required = true, description = "Tipo de error del servicio")
    private String type;

    @Schema(required = true, description = "Descripción de error del servicio")
    private String description;

    @Schema(required = true, description = "Detalle de error del servicio")
    private String detail;
}
