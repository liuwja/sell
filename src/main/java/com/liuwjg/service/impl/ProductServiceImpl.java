package com.liuwjg.service.impl;

import com.liuwjg.dataobject.ProductInfo;
import com.liuwjg.enums.ProductStatusEnum;
import com.liuwjg.repository.ProductInfoRrpository;
import com.liuwjg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductInfoRrpository repository;

    @Override
    public ProductInfo findById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductSataus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
