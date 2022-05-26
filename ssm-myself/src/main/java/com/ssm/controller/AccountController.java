package com.ssm.controller;

import com.ssm.pojo.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * encoding='utf-8'
 * author:mjh
 * date:2022-05-24 22:42
 **/
@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Account account){
        accountService.insert(account);
        return "success";

    }
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> accountList= accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("accountList");
        return  modelAndView;

    }
}
