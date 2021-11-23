package com.bjpowernode.service;

import com.bjpowernode.pojo.Account;

import java.sql.SQLException;

public interface AccountDaoService {
    public Account ById(int id) throws SQLException;
}
