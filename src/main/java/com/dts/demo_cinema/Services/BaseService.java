package com.dts.demo_cinema.Services;



import java.util.List;

public interface BaseService<T> {
    void save(T t);
    List<T> findAll();
    T findById(Integer id);
}
