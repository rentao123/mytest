package com.bjpowernode.service.imp;

import com.bjpowernode.mapper.imp.AccountDaoImp;
import com.bjpowernode.pojo.Account;
import com.bjpowernode.service.AccountDaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

@Service
public class AccountDaoServiceImp implements AccountDaoService {

    @Resource
    private AccountDaoImp accountDaoImp;

    @Override
    public Account ById(int id) throws SQLException {
        return accountDaoImp.ById(id);
    }
}
