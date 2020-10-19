package com.jlq.service.impl;

import com.jlq.dao.IAccountDao;
import com.jlq.domain.Account;
import com.jlq.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/15 15:52
 */

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;


    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findById(Integer accountId) {
        return accountDao.findById(accountId);
    }

    public List<Account> findByName(String accountName) {
        return accountDao.findByName(accountName);
    }

    public void addAccount(Account account) {
        accountDao.addAccount(account);
    }

    public void updateAccount(Account account) {
        account.setMoney(account.getMoney()-1);
        accountDao.updateAccount(account);
        int i =  1/0;
        account.setMoney(account.getMoney()+1);
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}


