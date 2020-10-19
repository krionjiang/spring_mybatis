package com.jlq.dao;

import com.jlq.domain.Account;

import java.util.List;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/15 15:12
 */

public interface IAccountDao {

    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAll();

    /**
     * 根据id查询
     * @param accountId
     * @return
     */
    Account findById(Integer accountId);

    /**
     * 根据name查询
     * @param accountName
     * @return
     */
    List<Account> findByName(String accountName);

    /**
     * 添加账户
     * @param account
     */
    void addAccount(Account account);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除账户
     * @param accountId
     */
    void deleteAccount(Integer accountId);

}
