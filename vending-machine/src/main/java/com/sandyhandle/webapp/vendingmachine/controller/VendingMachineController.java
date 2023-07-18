package com.sandyhandle.webapp.vendingmachine.controller;

import com.sandyhandle.webapp.vendingmachine.models.ProductAddRequest;
import com.sandyhandle.webapp.vendingmachine.models.db.VendingMachine;
import com.sandyhandle.webapp.vendingmachine.service.VendingMachineService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vending-machines")
@RequiredArgsConstructor
@Log4j2
public class VendingMachineController {

    @Autowired
    private VendingMachineService vendingMachineService;

    @GetMapping
    public ResponseEntity<List<VendingMachine>> getAllVendingMachines(){
        List<VendingMachine> allVendingMachine = vendingMachineService.getAllVendingMachine();
        return new ResponseEntity<>(allVendingMachine, HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Void> addProduct(@PathVariable("id") long vmId, @RequestBody ProductAddRequest productAddRequest){
        vendingMachineService.addProduct(vmId, productAddRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Long> addVendingMachine(){
        long l = vendingMachineService.addVendingMachine();
        return new ResponseEntity<>(l, HttpStatus.OK);
    }
}
