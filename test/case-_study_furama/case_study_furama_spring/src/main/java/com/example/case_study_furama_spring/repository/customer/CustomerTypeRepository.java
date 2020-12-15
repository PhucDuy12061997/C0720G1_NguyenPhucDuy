package com.example.case_study_furama_spring.repository.customer;

import com.example.case_study_furama_spring.entity.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType,String> {

}
