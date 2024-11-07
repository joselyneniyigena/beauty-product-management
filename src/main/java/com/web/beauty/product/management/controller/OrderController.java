package com.web.beauty.product.management.controller;

import com.web.beauty.product.management.model.Order;
import com.web.beauty.product.management.model.OrderItem;
import com.web.beauty.product.management.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/{orderId}/items")
    public ResponseEntity<String> addItemToOrder(@PathVariable Long orderId, @RequestBody OrderItem orderItem) {
        orderService.addOrderItemToOrder(orderId, orderItem);
        return ResponseEntity.ok("Order item added successfully.");
    }
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return (Order) orderService.getOrderById(id).getOrderItems();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}
