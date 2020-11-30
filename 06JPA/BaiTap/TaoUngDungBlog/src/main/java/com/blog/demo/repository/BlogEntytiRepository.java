package com.blog.demo.repository;

import com.blog.demo.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogEntytiRepository extends JpaRepository<BlogEntity,Integer> {
//    List<BlogEntity> findByNameContaining(String name);


}
