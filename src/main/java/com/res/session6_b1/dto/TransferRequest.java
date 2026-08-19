package com.res.session6_b1.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record TransferRequest(
        @NotNull(message = "Sender account ID cannot be null")
        String senderAccountId,

        @NotBlank(message = "Receiver account number cannot be blank")
        String receiverAccountNumber,

        @NotBlank(message = "Bank code cannot be blank")
        String bankCode,

        @NotNull(message = "Amount cannot be null")
        @DecimalMin(value = "10000", message = "Amount must be greater than or equal to 10000")
        BigDecimal amount,

        @Size(max = 255, message = "Description cannot be longer than 255 characters")
        String description
) {
}
