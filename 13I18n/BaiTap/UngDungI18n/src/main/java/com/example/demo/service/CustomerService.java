package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Integer id);

    void save(Customer customer);

    void remove(Integer id);

    Iterable<Customer> findAllByProvince(Province province);

Page<Customer>findAllByFirstNameContaining(String firstName, Pageable pageable);
}
