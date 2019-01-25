package com.alexesmet.example.service;

import com.alexesmet.example.entity.Entity;
import com.alexesmet.example.model.Dto;

public interface Converter<E extends Entity, D extends Dto> {
    E convert(D dto);
    D convert(E ent);
}

