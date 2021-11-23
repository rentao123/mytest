package com.bjpowernode.mapper;

import com.bjpowernode.pojo.Product;

import java.util.List;

public interface ProductDao {
    void save(Product product);
    List queryList();
}
