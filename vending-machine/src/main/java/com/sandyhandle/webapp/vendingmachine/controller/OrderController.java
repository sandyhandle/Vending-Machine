package com.sandyhandle.webapp.vendingmachine.controller;

import com.sandyhandle.webapp.vendingmachine.models.db.Order;
import com.sandyhandle.webapp.vendingmachine.models.db.Product;
import com.sandyhandle.webapp.vendingmachine.models.db.VendingMachine;
import com.sandyhandle.webapp.vendingmachine.service.OrderService;
import com.sandyhandle.webapp.vendingmachine.service.ProductService;
import com.sandyhandle.webapp.vendingmachine.service.VendingMachineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Spliterator;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final ProductService productService;
    private final VendingMachineService vendingMachineService;

    @GetMapping
    public List<Order> getAllOrderDetails(){
        return  orderService.getAllOrderDetails();
    }

    @PostMapping("/order")
    public ResponseEntity<String> placeOrder(@RequestBody Order order){
        Optional<Product> product = productService.gerProduct(order.getProductId());
        Optional<VendingMachine> vendingMachine =  vendingMachineService.getVendingMachine(order.getVmId());

        if(product.get().getProductName() == "Coke"){
            int noOfCoke = vendingMachine.get().getNoOfCoke();
            if(noOfCoke > 1){
                vendingMachine.get().setNoOfCoke(noOfCoke - 1);
                orderService.updateOrder(order);
                return ResponseEntity.ok("Collect your Coke at the bottom");
            }
        }
        return ResponseEntity.ok("your order can't process kindly try some time later");
    }
}
