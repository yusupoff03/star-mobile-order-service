package com.example.sofiyaorderservice.controller;

import com.example.sofiyaorderservice.dto.OrderDto;
import com.example.sofiyaorderservice.entity.OrderEntity;
import com.example.sofiyaorderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("order/api/v1")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/{userId}/add")
    public ResponseEntity<OrderEntity> add(
            @RequestBody OrderDto orderDto,
            @PathVariable UUID userId,
            @RequestParam Integer amount
    ){
        return ResponseEntity.ok(orderService.add(orderDto,userId,amount));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<OrderEntity>> getAll(
            @RequestParam int size,
            @RequestParam int page
    ){
        return ResponseEntity.ok(orderService.getAllProducts(size, page));
    }

    @GetMapping("/search")
    public ResponseEntity<List<OrderEntity>> search(
            @RequestParam int size,
            @RequestParam int page,
            @RequestParam String name
    ){
        return ResponseEntity.status(200).body(orderService.search(size, page, name));
    }

    @PutMapping("/{userId}/update")
    public ResponseEntity<OrderEntity> update(
            @RequestBody OrderDto orderDto,
            @PathVariable UUID userId,
            @RequestParam UUID orderId
    ){
        return ResponseEntity.ok(orderService.update(orderDto,orderId,userId));
    }

    @DeleteMapping("/{userId}/delete")
    public ResponseEntity<Boolean> delete(
            @PathVariable UUID userId,
            @RequestParam UUID orderId
    ){
        return ResponseEntity.ok(orderService.deleteById(orderId,userId));
    }



}
