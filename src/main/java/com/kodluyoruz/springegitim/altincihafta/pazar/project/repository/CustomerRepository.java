package com.kodluyoruz.springegitim.altincihafta.pazar.project.repository;

import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
