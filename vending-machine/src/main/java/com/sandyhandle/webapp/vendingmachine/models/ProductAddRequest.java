package com.sandyhandle.webapp.vendingmachine.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductAddRequest {
    private String productName;
    private int productRate;
    private int noOfProduct;
}
