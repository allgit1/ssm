package com.ssm.mapper;

import com.ssm.pojo.Account;

import java.util.List;

public interface AccountMapper {
    void insert(Account account);
    List<Account> findAll();
}
