package com.example.demo.repository;

import com.example.demo.entity.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends PagingAndSortingRepository<Province , Integer> {
}
