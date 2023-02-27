package com.example.demo.model;

import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import java.util.UUID;

/**
 * User entity.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class User implements Serializable {

  private Integer id;

  private UUID uuid;

  private String name;

  private Boolean validated;

  private Boolean upgraded;

  private Boolean confirmedCvu;

  private Boolean confirmedAlias;

  private String accountCvu;

  private String accountAlias;

  private String lastName;

  private Integer documentNumber;

  private String cuit;

  private String email;

  private String address;

  private String province;

  private String city;

  private String postalCode;

  private Date birthDate;

  private String pin;

  private String phoneNumber;

  private Float percentageValidation;

  private Integer counterPinTry;

  private Boolean userLockedByInvalidPin;
}
