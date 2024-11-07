package com.web.beauty.product.management.repo;

import com.web.beauty.product.management.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
