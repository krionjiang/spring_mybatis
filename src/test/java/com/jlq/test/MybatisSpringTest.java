package com.jlq.test;

import com.jlq.domain.Account;
import com.jlq.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/15 15:58
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class MybatisSpringTest {

    @Autowired
    private IAccountService accountService;

    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    @Test
    public void test() {
//        System.out.println(accountService);
        List<Account> accounts = accountService.findAll();
        for (Account account:accounts
             ) {
            System.out.println(account);
        }
    }

    @Test
    public void testAdd(){
        Account account = new Account();
        account.setName("fff");
        account.setMoney(9000f);
        accountService.addAccount(account);
    }

    @Test
    public void testXML(){
        dataSourceTransactionManager.getDataSource();
    }

    @Test
    public void testUpdate() {
        Account account = accountService.findById(1);
        accountService.updateAccount(account);
    }
}


