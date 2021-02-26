package stu.codegym.exam.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface Service<T>{

    List<T> findAll();

    Page<T> findAll(Pageable pageable);

    Optional<T> findById(Long id);

    void save(T t);

    void delete(T t);

    void deleteById(Long id);

}
