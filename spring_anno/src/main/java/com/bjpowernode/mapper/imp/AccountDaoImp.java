package com.bjpowernode.mapper.imp;

import com.bjpowernode.mapper.AccountDao;
import com.bjpowernode.pojo.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;


@Repository
public class AccountDaoImp implements AccountDao {

    @Autowired
    private QueryRunner qr;


    @Override
    public Account ById(int id) throws SQLException {
        String sql = "select * from account where id = ?";
        return qr.query(sql,new BeanHandler<Account>(Account.class),id);
    }
}
