package com.example.sofiyaorderservice.service;

import com.example.sofiyaorderservice.dto.OrderDto;
import com.example.sofiyaorderservice.entity.OrderEntity;

import java.util.List;
import java.util.UUID;

public interface OrderService {
    OrderEntity add(OrderDto orderDto, UUID userId, Integer amount);
    List<OrderEntity> getAllProducts(int size, int page);
    List<OrderEntity> search(int page,int size,String name);
    Boolean deleteById(UUID id,UUID userId);
    OrderEntity update(OrderDto update,UUID id,UUID userId);
    List<OrderEntity> getUserOrders(UUID userId);


}
