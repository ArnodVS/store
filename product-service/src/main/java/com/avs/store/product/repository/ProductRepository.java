package com.avs.store.product.repository;

import com.avs.store.product.repository.entity.Category;
import com.avs.store.product.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(Category category);

}
