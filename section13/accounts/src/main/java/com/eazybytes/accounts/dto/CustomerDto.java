package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name = "Customer",
description = "Schema to hold Customer and Account Information")
public class CustomerDto {

    @Schema(description = "Name of the Customer", example = "Samuel Jackson")
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name must be between 5 and 30")
    private String name;

    @Schema(description = "Email of the Customer", example = "SamuelJackson@gmail.com")
    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email address must be a valid value")
    private String email;

    @Schema(description = "Mobile Number of the Customer", example = "08033247898")
    @Pattern(regexp = "(^$|[0-9]{11})", message = "Mobile number must be 11 digits")
    private String mobileNumber;

    @Schema(description = "Account Details of the Customer")
    private AccountsDto accountsDto;
}
