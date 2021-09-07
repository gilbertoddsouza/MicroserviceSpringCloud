package com.guilherme.productcatalog.repository;

import com.guilherme.productcatalog.modal.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByName(String name);
}
