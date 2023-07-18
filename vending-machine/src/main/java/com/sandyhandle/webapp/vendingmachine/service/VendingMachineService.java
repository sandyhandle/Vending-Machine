package com.sandyhandle.webapp.vendingmachine.service;

import com.sandyhandle.webapp.vendingmachine.models.ProductAddRequest;
import com.sandyhandle.webapp.vendingmachine.models.db.Product;
import com.sandyhandle.webapp.vendingmachine.models.db.VendingMachine;
import com.sandyhandle.webapp.vendingmachine.repository.VendingMachineRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class VendingMachineService {
    @Autowired
    private final VendingMachineRepository vendingMachineRepository;


    public List<VendingMachine> getAllVendingMachine(){
        return vendingMachineRepository.findAll();
    }

    public void addProduct(long vmId, ProductAddRequest productAddRequest) {

        VendingMachine vendingMachine = vendingMachineRepository.getById(vmId);
        log.info(vendingMachine.getVmId());

        Product product = Product.builder()
                .productId(vendingMachine.getProducts().size()+1)
                .productName(productAddRequest.getProductName())
                .rateOfOneProduct(productAddRequest.getProductRate())
                .count(productAddRequest.getNoOfProduct())
                .vmId(vmId)
                .build();

        vendingMachine.getProducts().add(product);
        log.info(vendingMachine.getProducts());
        vendingMachineRepository.save(vendingMachine);
    }

    public long addVendingMachine() {
        VendingMachine vendingMachine = VendingMachine.builder()
                .products(new ArrayList<>())
                .amount(0)
                .build();
        vendingMachineRepository.save(vendingMachine);
        return vendingMachine.getVmId();
    }
}
