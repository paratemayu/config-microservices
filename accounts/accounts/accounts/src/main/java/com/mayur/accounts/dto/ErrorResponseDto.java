package com.mayur.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "Error Response",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error Code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "The  message representing the error happened"
    )
    private String errorMessage;
    @Schema(
            description = "The representing when the error happened"
    )
    private LocalDateTime errorTime;

}
