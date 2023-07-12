package com.sandyhandle.webapp.vendingmachine.repository;

import com.sandyhandle.webapp.vendingmachine.models.db.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class OrderRepository {
    private List<Order> orderList = new ArrayList<>();


}
