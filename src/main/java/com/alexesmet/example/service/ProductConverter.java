package com.alexesmet.example.service;

import com.alexesmet.example.entity.Product;
import com.alexesmet.example.model.ProductDto;

public class ProductConverter implements Converter<Product, ProductDto> {
    @Override
    public Product convert(ProductDto dto) {
        return new Product(
                dto.getId(),
                dto.getTitle(),
                dto.getImagePath(),
                dto.getAmount(),
                dto.getPrice(),
                dto.isSale()
        );
    }

    @Override
    public ProductDto convert(Product ent) {
        return new ProductDto(
                ent.getId(),
                ent.getTitle(),
                ent.getImagePath(),
                ent.getAmount(),
                ent.getPrice(),
                ent.isSale()
        );
    }
}
