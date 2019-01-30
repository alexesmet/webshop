package com.alexesmet.example.webshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;


@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements EntityInterface {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String comment;
    @Column(name = "image_path")
    private String imagePath;
    private Integer amount;
    @Digits(integer=7, fraction=2)
    private BigDecimal price;
    private boolean sale;
}