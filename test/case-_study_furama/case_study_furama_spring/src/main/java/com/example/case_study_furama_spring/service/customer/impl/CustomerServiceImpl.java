package com.example.case_study_furama_spring.service.customer.impl;

import com.example.case_study_furama_spring.entity.customer.Customer;
import com.example.case_study_furama_spring.entity.customer.CustomerType;
import com.example.case_study_furama_spring.repository.customer.CustomerRepository;
import com.example.case_study_furama_spring.repository.customer.CustomerTypeRepository;
import com.example.case_study_furama_spring.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllAndSortByID(Pageable pageable) {
        return customerRepository.findAllAndSortByID(pageable);
    }

    @Override
    public Page<Customer> findAllAndSortByName(Pageable pageable) {
        return this.customerRepository.findAllAndSortByName(pageable);
    }

    @Override
    public Page<Customer> findAllAndSortByBirthDay(Pageable pageable) {
        return customerRepository.findAllAndSortByBirthDay(pageable);
    }

    @Override
    public Page<Customer> findByNameContaining(Pageable pageable, String name) {
        return this.customerRepository.findByNameContaining(pageable, name);
    }

    @Override
    public void deleteCustomer(String id) {
        this.customerRepository.deleteById(id);
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public List<CustomerType> allCustomerType() {
        return customerTypeRepository.findAll();
    }

    @Override
    public void update(Customer customer) {
        this.customerRepository.save(customer);
    }
}
