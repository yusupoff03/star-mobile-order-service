package com.example.sofiyaorderservice.service;

import com.example.sofiyaorderservice.dto.OrderDto;
import com.example.sofiyaorderservice.entity.OrderEntity;
import com.example.sofiyaorderservice.exception.DataNotFoundException;
import com.example.sofiyaorderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    @Override
    public OrderEntity add(OrderDto orderDto, UUID userId, Integer amount) {
        return null;
    }


    @Override
    public List<OrderEntity> getAllProducts(int size, int page) {
        Pageable pageable = PageRequest.of(page, size);
        List<OrderEntity> content = orderRepository.findAll(pageable).getContent();
        if(content.isEmpty()){
            throw new DataNotFoundException("Orders not found");
        }
        return content;
    }

    @Override
    public List<OrderEntity> search(int page, int size, String name) {
        return null;
    }

    @Override
    public Boolean deleteById(UUID id, UUID userId) {
        OrderEntity orderEntity = orderRepository.findById(id)
                .orElseThrow(() -> new DataNotFoundException("Order not found"));
        if (orderEntity.getUserId().equals(userId)){
            orderRepository.deleteById(id);
            return true;
        }
        throw new DataNotFoundException("Order not found");
    }

    @Override
    public OrderEntity update(OrderDto update, UUID id, UUID userId) {
        return null;
    }
}
