package com.blog.demo.service.impl;

import com.blog.demo.entity.BlogEntity;
import com.blog.demo.repository.BlogEntytiRepository;
import com.blog.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceimpl implements BlogService {
    @Autowired
   private BlogEntytiRepository blogEntytiRepository;

    @Override
    public List<BlogEntity> findAll() {
        return this.blogEntytiRepository.findAll();
    }

    @Override
    public void save(BlogEntity blogEntity) {
        this.blogEntytiRepository.save(blogEntity);
    }

    @Override
    public BlogEntity findById(int id) {
        return this.blogEntytiRepository.findById(id).orElse(null);
    }

    @Override
    public void update(int id, BlogEntity blogEntity) {
        this.blogEntytiRepository.save(blogEntity);
    }

    @Override
    public void remove(int id) {
        this.blogEntytiRepository.deleteById(id);
    }

//    @Override
//    public List<BlogEntity> findByName(String name) {
//        return this.blogEntytiRepository.findByNameContaining(name);
//    }

//    @Override
//    public void find(BlogEntity blogEntity) {
//        return this.blogEntytiRepository.findByNameContaining()
//    }

//    @Override
//    public List<BlogEntity> finByName(String name) {
//        return this.blogEntytiRepository.findById(name);
//    }


}
