package com.alexesmet.example.webshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto implements Dto {
    public Integer id;
    public String title;
    public String comment;
    public Integer amount;
    public BigDecimal price;
    public boolean sale;
    public Integer image;

    public String getPriceString(){
        return price.toString() + "$";
    }
}
