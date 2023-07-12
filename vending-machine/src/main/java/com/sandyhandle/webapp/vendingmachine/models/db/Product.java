package com.sandyhandle.webapp.vendingmachine.models.db;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    int productId;
    String productName;
    int productRate;
}
