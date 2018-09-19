package com.lupitsa.shop.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T extends Serializable, K> {

    List<T> findAll();

    T save(T t);

    T find(K k);

    void deleteById(K k);

    void delete(T t);



}
