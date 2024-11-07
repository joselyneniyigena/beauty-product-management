package com.web.beauty.product.management.repo;

import com.web.beauty.product.management.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
