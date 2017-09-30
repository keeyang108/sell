package com.imooc.dao;

import com.imooc.common.BaseSpringTest;
import com.imooc.model.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * @author KeeYang on 2017/9/27.
 * @Description :
 */
public class ProductCategoryDaoTest extends BaseSpringTest{

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findOneTest(){
        ProductCategory category =  productCategoryDao.findOne(1);
        Assert.notNull(category);
    }

    @Test
    public void insertTest(){

        ProductCategory category =  productCategoryDao.findOne(1);
        category.setCategoryType(3000);

        productCategoryDao.save(category);
    }
}
