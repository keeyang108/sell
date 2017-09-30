package com.imooc.dao;

import com.imooc.common.BaseSpringTest;
import com.imooc.model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author KeeYang on 2017/9/28.
 * @Description :
 */
public class ProductInfoDaoTest extends BaseSpringTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = productInfoDao.findByProductStatus(1);
        Assert.assertNotNull(productInfoList);
    }

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1001");
        productInfo.setCategoryType(2000);
        productInfo.setProductDescription("this is a delicious");
        productInfo.setProductIcon("www.imooc.cn");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal("2"));
        productInfo.setProductStatus(1);
        productInfo.setProductStock(50);

        productInfoDao.save(productInfo);
    }

}
