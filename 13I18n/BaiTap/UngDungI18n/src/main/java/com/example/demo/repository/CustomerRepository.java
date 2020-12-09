package com.example.demo.repository;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Integer> {
    Iterable<Customer>findAllByProvince(Province province);
    Page<Customer>findAllByFirstNameContaining(String firstName, Pageable pageable);

}
