package com.example.sofiyaorderservice.repository;

import com.example.sofiyaorderservice.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
//    Page<OrderEntity> findOrderEntitiesByUsersId(UUID userId, Pageable pageable);
//
//    Page<OrderEntity> findOrderEntitiesByProductsUsersId(UUID userId, Pageable pageable);

        List<OrderEntity> searchInventoryEntitiesByProductIdContainingIgnoreCase(UUID productId, Pageable pageable);



}
