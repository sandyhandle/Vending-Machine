package com.sandyhandle.webapp.vendingmachine.service;

import com.sandyhandle.webapp.vendingmachine.models.db.Order;
import com.sandyhandle.webapp.vendingmachine.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getAllOrderDetails(){
        return orderRepository.getOrderList();
    }

    public void updateOrder(Order order){
        orderRepository.getOrderList().add(order);
    }
}
