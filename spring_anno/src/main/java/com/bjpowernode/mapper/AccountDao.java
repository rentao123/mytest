package com.bjpowernode.mapper;


import com.bjpowernode.pojo.Account;

import java.sql.SQLException;

public interface AccountDao {
public Account ById(int id) throws SQLException;
}
