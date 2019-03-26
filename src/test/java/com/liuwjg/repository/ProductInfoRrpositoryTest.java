package com.liuwjg.repository;

import com.liuwjg.SellApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.liuwjg.dataobject.ProductInfo;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class ProductInfoRrpositoryTest extends SellApplicationTests{
    @Autowired
    private ProductInfoRrpository productInfoRrpository;
    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("皮蛋粥很好喝");
        productInfo.setProductIcon("pidanzhou.jpg");
        productInfo.setProductSataus(0);
        productInfo.setCategoryType(2);
        ProductInfo result = productInfoRrpository.save(productInfo);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByProductSataus(){
        List productInfoList = productInfoRrpository.findByProductSataus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}