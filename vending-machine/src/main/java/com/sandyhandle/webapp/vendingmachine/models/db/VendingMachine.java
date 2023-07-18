package com.sandyhandle.webapp.vendingmachine.models.db;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "VENDING_MACHINE_DETAILS")
public class VendingMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vmId;
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "vending_machine_id")
    @ElementCollection
    private List<Product> products;
    private int amount;
//    int noOfOnesCoins;
//    int noOfTwosCoins;
//    int noOfFivesCoins;
//    int noOfTensCoins;
//    int noOfTwentyFivesCoins;
}
