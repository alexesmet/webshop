package com.alexesmet.example.webshop.controller;

import com.alexesmet.example.webshop.entity.Product;
import com.alexesmet.example.webshop.model.ProductDto;
import com.alexesmet.example.webshop.service.crud.CrudServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
//TODO: Migrate on web-sockets
public class RootController {

    private final CrudServiceInterface<Product, ProductDto> productCrudService;

    public RootController(CrudServiceInterface<Product, ProductDto> productCrudService) {
        this.productCrudService = productCrudService;
    }

    @RequestMapping("/")
    public String index(Model model){

        List<ProductDto> all = productCrudService
                .findAll()
                .stream()
                .peek(productDto -> { if (productDto.image == null) productDto.image = "/img/no_image_found.png"; })
                .collect(Collectors.toList());

        model.addAttribute("products",all);
        return "index";
    }
}
