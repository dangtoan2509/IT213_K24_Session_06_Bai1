package com.res.session6_b1.controller;

import com.res.session6_b1.dto.TransferRequest;
import com.res.session6_b1.dto.TransferResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/transfer")
public class TransferController {

    @PostMapping
    public ResponseEntity<TransferResponse> transfer(@Valid @RequestBody TransferRequest request) {
        System.out.println("Received valid transfer request: " + request);

        TransferResponse response = new TransferResponse(
                UUID.randomUUID().toString(),
                "SUCCESS",
                "Transaction completed successfully."
        );
        return ResponseEntity.ok(response);
    }
}
