package com.liuwjg.repository;

import com.liuwjg.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRrpository extends JpaRepository<ProductInfo,String>{
    List<ProductInfo> findByProductSataus(Integer productSataus);
}
