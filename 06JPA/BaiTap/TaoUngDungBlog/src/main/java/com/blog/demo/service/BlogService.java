package com.blog.demo.service;

import com.blog.demo.entity.BlogEntity;

import java.util.List;

public interface BlogService {
    List<BlogEntity> findAll();

    void save(BlogEntity blogEntity);
    BlogEntity findById(int id);

    void update(int id,BlogEntity blogEntity);

    void remove(int id);
//    List<BlogEntity>sorfByName(String name);
}
