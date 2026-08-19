package com.res.session6_b1;

import com.res.session6_b1.dto.TransferRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidationTest {

    @Test
    void testInvalidTransferRequest() {
        TransferRequest request = new TransferRequest(
                "SENDER001",
                "", // Invalid: receiverAccountNumber is blank
                "VCB",
                new BigDecimal("5000"), // Invalid: amount is less than 10000
                "Invalid Transfer"
        );

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<TransferRequest>> violations = validator.validate(request);

        assertFalse(violations.isEmpty());

        for (ConstraintViolation<TransferRequest> violation : violations) {
            System.out.println(violation.getPropertyPath() + " " + violation.getMessage());
        }
    }
}
