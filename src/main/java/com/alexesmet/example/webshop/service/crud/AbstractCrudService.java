package com.alexesmet.example.webshop.service.crud;

import com.alexesmet.example.webshop.entity.EntityInterface;
import com.alexesmet.example.webshop.model.Dto;
import com.alexesmet.example.webshop.service.converter.Converter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;


public abstract class AbstractCrudService<E extends EntityInterface, D extends Dto> implements CrudServiceInterface<E, D> {
    private Converter<E, D> converter;
    private JpaRepository<E, Integer> repository;

    public AbstractCrudService(Converter<E, D> converter, JpaRepository<E, Integer> repository) {
        this.converter = converter;
        this.repository = repository;
    }

    @Override
    public List<D> findAll(){
        return repository.findAll()
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList());

    }

    @Override
    public D find(Integer id){
        E e = repository.
                findById(id).
                orElseThrow(() -> new IllegalArgumentException("Can't find entity with this id: " + id.toString()));
        return converter.convert(e);
    }

    @Override
    public void save(D d){
        repository.save(converter.convert(d));

    }


}
