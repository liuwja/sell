package com.liuwjg.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfoVO {
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private String productDescription;

    private String productIcon;
}
