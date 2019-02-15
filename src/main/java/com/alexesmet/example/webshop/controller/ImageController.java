package com.alexesmet.example.webshop.controller;

import com.alexesmet.example.webshop.entity.Image;
import com.alexesmet.example.webshop.repository.ImageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

@Controller
public class ImageController {

    private final ImageRepository imageRepository;

    public ImageController(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @RequestMapping(value = "image/{imageId}")
    @ResponseBody
    public byte[] getImage(@PathVariable(value = "imageId") Integer id) throws IOException {
        Image image = imageRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cannot find image with this id."));

        return image.getImage();
    }
}
