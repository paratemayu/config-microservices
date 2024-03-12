package com.mayur.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @NotEmpty(message = "Account Number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @Schema(
            description = "Account Number of Mayur Parate account"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be empty or null")
    @Schema(
            description = "Account type of mayur parate account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be a null or empty")
    @Schema(
            description = "Mayur Bank branch address"
    )
    private String branchAddress;

}
