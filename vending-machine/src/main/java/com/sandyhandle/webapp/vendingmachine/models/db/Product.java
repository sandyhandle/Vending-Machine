package com.sandyhandle.webapp.vendingmachine.models.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class Product {
    private long vmId;

    private int productId;
    private String productName;
    int count;
    private int rateOfOneProduct;
}
