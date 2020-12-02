package com.example.validate.service.impl;

import com.example.validate.entity.User;
import com.example.validate.repository.UserRepository;
import com.example.validate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void save(User user) {
this.userRepository.save(user);
    }
}
