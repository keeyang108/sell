package com.imooc.service.impl;

import com.imooc.common.BaseSpringTest;
import com.imooc.model.ProductInfo;
import com.imooc.service.ProductInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author KeeYang on 2017/9/29.
 * @Description :
 */
public class ProductInfoServiceImplTest extends BaseSpringTest {

    @Autowired
    private ProductInfoService productInfoService;

    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productInfoService.findOne("1001");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findAll() throws Exception {
        List<ProductInfo> productInfos = productInfoService.findAll();
        Assert.assertNotEquals(0,productInfos.size());
    }

    @Test
    public void findAll1() throws Exception {
        PageRequest pageRequest = new PageRequest(0,10);
        Page<ProductInfo>  productInfos = productInfoService.findAll(pageRequest);
        Assert.assertNotEquals(0,productInfos.getContent());
    }

    @Test
    public void save() throws Exception {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1002");
        productInfo.setCategoryType(1000);
        productInfo.setProductDescription("this is a test");
        productInfo.setProductIcon("www.imooc.cn");
        productInfo.setProductName("白粥");
        productInfo.setProductPrice(new BigDecimal("1"));
        productInfo.setProductStatus(0);
        productInfo.setProductStock(50);

        ProductInfo product = productInfoService.save(productInfo);
        Assert.assertNotNull(product);
    }

}
