package com.sandyhandle.webapp.vendingmachine.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Data
@AllArgsConstructor
public class OrderRequest {
    int vmId;
    int productId;
    int amount;
}
