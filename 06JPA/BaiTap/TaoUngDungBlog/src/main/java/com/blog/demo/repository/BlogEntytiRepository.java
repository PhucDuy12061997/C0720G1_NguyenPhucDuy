package com.blog.demo.repository;

import com.blog.demo.entity.BlogEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogEntytiRepository extends JpaRepository<BlogEntity,Integer> {
//    List<BlogEntity> findByNameContaining(String name);
//    @Query(value = "select *from blogentity where name_blog",nativeQuery = true)
//    List<BlogEntity>getAllByName(String name);
//Page<BlogEntity> finAllByNameContaining(String name, Pageable pageable);


}
