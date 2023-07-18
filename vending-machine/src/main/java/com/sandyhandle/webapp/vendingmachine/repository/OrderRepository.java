package com.sandyhandle.webapp.vendingmachine.repository;

import com.sandyhandle.webapp.vendingmachine.models.db.Order;
import com.sandyhandle.webapp.vendingmachine.models.db.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
