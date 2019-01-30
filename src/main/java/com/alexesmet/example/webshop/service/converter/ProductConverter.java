package com.alexesmet.example.webshop.service.converter;

import com.alexesmet.example.webshop.entity.Product;
import com.alexesmet.example.webshop.model.ProductDto;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter implements Converter<Product, ProductDto> {
    @Override
    public Product convert(ProductDto dto) {
        return new Product(

                dto.getId(),
                dto.getTitle(),
                dto.getImage(),
                dto.getComment(),
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
                ent.getComment(),
                ent.getAmount(),
                ent.getPrice(),
                ent.isSale()
        );
    }
}
