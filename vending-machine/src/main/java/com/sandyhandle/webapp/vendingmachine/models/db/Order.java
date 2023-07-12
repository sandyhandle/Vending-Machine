package com.sandyhandle.webapp.vendingmachine.models.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Order {
    static int i = 0;
    {
        i++;
    }
    int orderId;
    @Setter
    int vmId;
    @Setter
    int productId;
    @Setter
    int cashDeposited;
    @Setter
    boolean orderDeliveredOrNot;

    public Order(int vmId, int productId, int cashDeposited, boolean orderDeliveredOrNot) {
        this.orderId = i;
        this.vmId = vmId;
        this.productId = productId;
        this.cashDeposited = cashDeposited;
        this.orderDeliveredOrNot = orderDeliveredOrNot;
    }

    public void setOrderId(int orderId) {
        this.orderId = i;
    }
}
