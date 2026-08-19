package com.res.session6_b1.dto;

public record TransferResponse(
        String transactionId,
        String status,
        String message
) {
}
