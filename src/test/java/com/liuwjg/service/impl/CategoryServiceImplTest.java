package com.liuwjg.service.impl;

import com.liuwjg.SellApplicationTests;
import com.liuwjg.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class CategoryServiceImplTest extends SellApplicationTests{
    @Autowired
    private CategoryServiceImpl categoryService;
    @Test
    public void getById() {
        ProductCategory productCategory = categoryService.findById(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> list = categoryService.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("女生专享",6);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}