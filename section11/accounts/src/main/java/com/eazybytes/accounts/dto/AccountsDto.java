package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name = "Accounts",
        description = "Schema to hold Account Information")
public class AccountsDto {
    @Schema(
            description = "Account Number of Customer",example = "Savings")
    @NotEmpty(message = "Account Number cannot be null or Empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account Type of Customer")
    @NotEmpty(message = "Account Type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Branch address of Customer",example = "New york USA")
    @NotEmpty(message = "Branch Address cannot be null or empty")
    private String branchAddress;
}
