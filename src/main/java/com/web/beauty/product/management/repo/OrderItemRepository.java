package com.web.beauty.product.management.repo;

import com.web.beauty.product.management.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
