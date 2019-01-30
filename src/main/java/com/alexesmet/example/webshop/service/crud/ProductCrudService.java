package com.alexesmet.example.webshop.service.crud;

import com.alexesmet.example.webshop.entity.Product;
import com.alexesmet.example.webshop.model.ProductDto;
import com.alexesmet.example.webshop.service.converter.Converter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductCrudService extends AbstractCrudService<Product, ProductDto> {
    public ProductCrudService(Converter<Product, ProductDto> converter, JpaRepository<Product, Integer> repository) {
        super(converter, repository);
    }
}
