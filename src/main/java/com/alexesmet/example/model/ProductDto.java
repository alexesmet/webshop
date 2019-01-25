package com.alexesmet.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto implements Dto {
    private Integer id;
    private String title;
    private String imagePath;
    private Integer amount;
    private BigDecimal price;
    private boolean sale;
}
