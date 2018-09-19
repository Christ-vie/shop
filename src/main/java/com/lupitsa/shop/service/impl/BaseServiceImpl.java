package com.lupitsa.shop.service.impl;

import com.lupitsa.shop.service.BaseService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<T extends Serializable, K> implements BaseService<T, K> {

    protected abstract JpaRepository<T, K> getRepository();

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public T save(T t) {
        return getRepository().save(t);
    }

    @Override
    public T find(K k) {
        return getRepository().getOne(k);
    }

    @Override
    public void deleteById(K k) {
        getRepository().deleteById(k);
    }

    @Override
    public void delete(T t) {
        getRepository().delete(t);
    }
}
