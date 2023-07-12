package com.sandyhandle.webapp.vendingmachine.repository;

import com.sandyhandle.webapp.vendingmachine.models.db.VendingMachine;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class VendingMachineRepository {

    private List<VendingMachine> vendingMachineList = new ArrayList<>();

    {
        vendingMachineList.add(new VendingMachine(1,
                5, 25,5,35, 5,45,
                100, 100, 100, 100, 100));
        vendingMachineList.add(new VendingMachine(2,
                35, 25,35,35, 56,45,
                100, 100, 100, 100, 100));
    }

}
