package com.example.demo.controller;


import com.example.demo.config.auth.CurrentUser;
import com.example.demo.config.auth.CustomUserDetails;
import com.example.demo.dto.ErrorResponse;
import com.example.demo.dto.MsAuthResponse;
import com.example.demo.enums.MsAuthResponseCode;
import com.example.demo.model.User;
import com.example.demo.utils.ConstantUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "ContactScheduleController")
@RestController
@RequestMapping(AuthController.URI)
public class AuthController {
    public static final String URI = "/ms-auth/AuthController/v1";
    public static final String DECODE = "/decode";



    @Operation(summary = "Obtener contactos de User", description = "Realiza una consulta y obtiene el listado de  contactos del usuario.", tags = {"ContactScheduleController"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = ConstantUtils.APPLICATION_JSON_V11, schema = @Schema(implementation = MsAuthResponse.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = MsAuthResponse  .class))),
            @ApiResponse(responseCode = "500", description = "Unexpected Error", content = @Content(mediaType = ConstantUtils.APPLICATION_JSON_V11, schema = @Schema(implementation = ErrorResponse.class)))})
    @GetMapping(path = {DECODE}, produces = {MediaType.APPLICATION_JSON_VALUE, ConstantUtils.APPLICATION_JSON_V11})
    public MsAuthResponse<CustomUserDetails> getToken(
            @CurrentUser CustomUserDetails userDetails) {
        return MsAuthResponse.<CustomUserDetails>builder().data(userDetails).build();
    }
}
