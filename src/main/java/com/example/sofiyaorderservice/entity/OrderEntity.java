package com.example.sofiyaorderservice.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@Entity(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class OrderEntity extends BaseEntity {

    private UUID productId;

    private UUID userId;

    private Double cost;

    private Double amount;





}
