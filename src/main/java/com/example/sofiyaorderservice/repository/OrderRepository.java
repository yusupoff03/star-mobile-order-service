package com.example.sofiyaorderservice.repository;

import com.example.sofiyaorderservice.entity.OrderEntity;;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
    List<OrderEntity> getOrderEntitiesByUserIdEquals(UUID userId);
}
