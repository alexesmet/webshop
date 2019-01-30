package com.alexesmet.example.webshop.service.crud;

import com.alexesmet.example.webshop.entity.EntityInterface;
import com.alexesmet.example.webshop.model.Dto;

import java.util.List;

public interface CrudServiceInterface<E extends EntityInterface, D extends Dto> {
    List<D> findAll();

    D find(Integer id);

    void save(D d);
}
