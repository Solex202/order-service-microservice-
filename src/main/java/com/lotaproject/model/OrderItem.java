package com.lotaproject.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;


}
