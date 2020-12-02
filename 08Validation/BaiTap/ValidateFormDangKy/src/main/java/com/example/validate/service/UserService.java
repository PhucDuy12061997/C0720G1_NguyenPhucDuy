package com.example.validate.service;

import com.example.validate.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user) ;
}
