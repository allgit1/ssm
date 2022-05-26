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
 * date:2022-05-24 14:34
 **/
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    //保存
    @RequestMapping("/accountSave")
    @ResponseBody
    public String save(Account account){
        accountService.save(account);
        return "success";
    }

    //查询
    @RequestMapping("/account")
    public ModelAndView findAll(){
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("account");
        return modelAndView;
    }
}
