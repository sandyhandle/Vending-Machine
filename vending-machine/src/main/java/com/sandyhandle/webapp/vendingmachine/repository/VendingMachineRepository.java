package com.sandyhandle.webapp.vendingmachine.repository;

import com.sandyhandle.webapp.vendingmachine.models.db.VendingMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendingMachineRepository extends JpaRepository<VendingMachine, Long> {
}
