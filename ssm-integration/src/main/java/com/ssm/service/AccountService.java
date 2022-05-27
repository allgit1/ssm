package com.ssm.service;

import com.ssm.pojo.Account;

import java.util.List;

public interface AccountService {

    public void save(Account account);
    List<Account> findAll();
    void update(Account account);
    Account get(Integer id);
    void delete(Integer id);
}
