package com.ssm.service;

import com.ssm.pojo.Account;

import java.util.List;

public interface AccountService {
    void insert(Account account);
    List<Account> findAll();
}
