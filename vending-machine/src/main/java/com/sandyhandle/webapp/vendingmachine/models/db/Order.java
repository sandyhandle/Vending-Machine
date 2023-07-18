package com.sandyhandle.webapp.vendingmachine.models.db;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Order_details")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    private int vmId;

    private int productId;

    private int cashDeposited;

    private boolean orderDeliveredOrNot;
    Instant date;
}
