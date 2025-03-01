package com.recharged.backend.repository;

import com.recharged.backend.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);

    List<Product> findAllByCategory(String category);

    Page<Product> findAllByCategory(String category, Pageable pageable);

    Optional<Product> findBySku(String sku);
}
