package com.sandyhandle.webapp.vendingmachine.controller;

import com.sandyhandle.webapp.vendingmachine.models.db.Product;
import com.sandyhandle.webapp.vendingmachine.models.db.VendingMachine;
import com.sandyhandle.webapp.vendingmachine.service.VendingMachineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vending-machines")
@RequiredArgsConstructor
public class VendingMachineController {

    private final VendingMachineService vendingMachineService;

    @GetMapping
    public List<VendingMachine> getProducts(){
        return vendingMachineService.getVendingMachineList();
    }


}
