package com.alexesmet.example.webshop.repository;

import com.alexesmet.example.webshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
