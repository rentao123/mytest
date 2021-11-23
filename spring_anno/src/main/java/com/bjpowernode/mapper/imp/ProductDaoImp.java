package com.bjpowernode.mapper.imp;

import com.bjpowernode.mapper.ProductDao;
import com.bjpowernode.pojo.Product;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

// 值是实例的唯一标识，默认是类名首字母小写
//@Component("productDao")
@Repository
public class ProductDaoImp implements ProductDao {

    // 根据类型注入
    @Autowired
    private QueryRunner qr;

    public void save(Product product) {
        String sql = "insert to product values(?,?,?,?,?)";
        try {
            qr.update(sql,product.getId(),product.getName(),product.getPrice(),product.getNum(),product.getDescription());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public List queryList(){
        String sql = "select * from product";
        try {
            return qr.query(sql,new BeanListHandler<>(Product.class));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }
}
