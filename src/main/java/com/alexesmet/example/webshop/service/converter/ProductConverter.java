package com.alexesmet.example.webshop.service.converter;

import com.alexesmet.example.webshop.entity.Product;
import com.alexesmet.example.webshop.model.ProductDto;
import com.alexesmet.example.webshop.repository.ImageRepository;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter implements Converter<Product, ProductDto> {

    private final ImageRepository imageRepository;

    public ProductConverter(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public Product convert(ProductDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setComment(dto.getComment());
        product.setAmount(dto.getAmount());
        product.setPrice(dto.getPrice());
        product.setSale(dto.isSale());
        product.setImage(imageRepository.getOne(dto.getId()));
        return product;

    }

    @Override
    public ProductDto convert(Product ent) {
        ProductDto productDto = new ProductDto();
        productDto.setId(ent.getId());
        productDto.setTitle(ent.getTitle());
        productDto.setComment(ent.getComment());
        productDto.setAmount(ent.getAmount());
        productDto.setPrice(ent.getPrice());
        productDto.setSale(ent.isSale());
        productDto.setImage(ent.getImage() != null ? ent.getImage().getId() : null);         /*ent.getImage().getId()*/
        return productDto;

    }
}
