package com.liuwjg.vo;

import lombok.Data;

import java.util.List;

@Data
public class ProductVO {

    private String categoryName;

    private Integer categoryType;

    private List<ProductInfoVO> productInfo;
}
