package com.imooc.service;

import com.imooc.model.ProductCategory;

import java.util.List;

/**
 * @author KeeYang on 2017/9/28.
 * @Description :
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
