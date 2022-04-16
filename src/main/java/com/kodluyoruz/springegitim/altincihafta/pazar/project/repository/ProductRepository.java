package com.kodluyoruz.springegitim.altincihafta.pazar.project.repository;

import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
