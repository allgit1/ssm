package com.ssm.service.impl;

import com.ssm.mapper.AccountMapper;
import com.ssm.pojo.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * encoding='utf-8'
 * author:mjh
 * date:2022-05-24 22:41
 **/
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void insert(Account account) {
        accountMapper.insert(account);

    }

    @Override
    public List<Account> findAll() {
        List<Account> list = accountMapper.findAll();
        return list;
    }
}
