package com.web.beauty.product.management.service;

import com.web.beauty.product.management.model.Order;
import com.web.beauty.product.management.model.OrderItem;

import java.util.List;

public interface OrderService {
    void addOrderItemToOrder(Long orderId, OrderItem orderItem);
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order saveOrder(Order order);
    void deleteOrder(Long id);
}
