package com.example.sofiyaorderservice.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderDto {

    @NotBlank(message = "product id not entered")
    private UUID productId;

    @NotBlank(message = "user id not entered")
    private UUID userId;

    @NotEmpty(message = "cost cannot be empty")
    private Double cost;

    @NotEmpty(message = "amount cannot be empty")
    private Double amount;

}
