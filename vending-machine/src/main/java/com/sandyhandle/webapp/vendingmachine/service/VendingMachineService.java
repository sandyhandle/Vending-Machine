package com.sandyhandle.webapp.vendingmachine.service;

import com.sandyhandle.webapp.vendingmachine.models.db.Product;
import com.sandyhandle.webapp.vendingmachine.models.db.VendingMachine;
import com.sandyhandle.webapp.vendingmachine.repository.ProductRepository;
import com.sandyhandle.webapp.vendingmachine.repository.VendingMachineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class VendingMachineService {

    private final VendingMachineRepository vendingMachineRepository;

    public List<VendingMachine> getVendingMachineList(){
        return vendingMachineRepository.getVendingMachineList();
    }

    public Optional<VendingMachine> getVendingMachine(int id){
        for(VendingMachine vendingMachine: vendingMachineRepository.getVendingMachineList()){
            if(vendingMachine.getVmId() == id){
                return Optional.of(vendingMachine);
            }
        }
        System.out.println("The vending machine that you are searching is not present");
        return null;
    }
}
