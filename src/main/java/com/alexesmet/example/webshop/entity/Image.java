package com.alexesmet.example.webshop.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "images")
public class Image implements EntityInterface {
    @Id
    @GeneratedValue
    private Integer id;
    private byte[] image;
    private String comment;
}
