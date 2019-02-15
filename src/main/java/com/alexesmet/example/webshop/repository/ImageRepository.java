package com.alexesmet.example.webshop.repository;

import com.alexesmet.example.webshop.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
