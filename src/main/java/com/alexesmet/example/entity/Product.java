package com.alexesmet.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Entity{
    private Integer id;
    private String title;
    private String imagePath;
    private Integer amount;
    private BigDecimal price;
    private boolean sale;
}