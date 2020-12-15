package com.example.springsecurity.service.Impl;


import com.example.springsecurity.model.Account;
import com.example.springsecurity.repository.AccountRepository;
import com.example.springsecurity.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }
}
