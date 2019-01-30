package com.alexesmet.example.webshop.service.converter;

import com.alexesmet.example.webshop.entity.EntityInterface;
import com.alexesmet.example.webshop.model.Dto;

public interface Converter<E extends EntityInterface, D extends Dto> {
    E convert(D dto);
    D convert(E ent);
}

