package com.example.springsecurity.service.Impl;


import com.example.springsecurity.model.Account;
import com.example.springsecurity.model.MyAccountDetail;
import com.example.springsecurity.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUserName(username);

        if(account == null) {
            throw new UsernameNotFoundException("Account not found: "+username);
        }
        return new MyAccountDetail(account);
    }
}
