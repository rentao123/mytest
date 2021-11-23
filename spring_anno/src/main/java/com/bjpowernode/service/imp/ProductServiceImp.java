package com.bjpowernode.service.imp;

import com.bjpowernode.mapper.ProductDao;
import com.bjpowernode.pojo.Product;
import com.bjpowernode.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ProductServiceImp implements ProductService {


    //@Autowired   // 根据类型注入
    //@Qualifier("productDaoImp")  // 根据id进行唯一匹配
    @Resource // (name="productDaoImp")
    private ProductDao productDao;

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public List queryList() {
        return productDao.queryList();
    }


}
