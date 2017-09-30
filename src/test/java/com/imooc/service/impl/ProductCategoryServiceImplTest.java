package com.imooc.service.impl;

import com.imooc.common.BaseSpringTest;
import com.imooc.model.ProductCategory;
import com.imooc.service.ProductCategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author KeeYang on 2017/9/28.
 * @Description :
 */
public class ProductCategoryServiceImplTest extends BaseSpringTest {

    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategory category = productCategoryService.findOne(1);
        Assert.assertNotNull(category);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> categories = productCategoryService.findAll();
        Assert.assertNotEquals(0,categories.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> types = Arrays.asList(1,2,3,4);
        List<ProductCategory> categories = productCategoryService.findByCategoryTypeIn(types);
        Assert.assertNotNull(categories);
    }

    @Test
    public void save() throws Exception {
        ProductCategory category = new ProductCategory();
        category.setCategoryType(2000);
        category.setCategoryName("米饭");
        ProductCategory result = productCategoryService.save(category);
        Assert.assertNotNull(result);
    }

}
