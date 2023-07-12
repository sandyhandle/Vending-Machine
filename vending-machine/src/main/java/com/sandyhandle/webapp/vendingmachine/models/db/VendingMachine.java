package com.sandyhandle.webapp.vendingmachine.models.db;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VendingMachine {

    int vmId;
    int noOfCoke;
    int rateOfOneCoke;
    int noOfPepsi;
    int rateOfOnePepsi;
    int noOfSoda;
    int rateOfOneSoda;
    int noOfOnesCoins;
    int noOfTwosCoins;
    int noOfFivesCoins;
    int noOfTensCoins;
    int noOfTwentyFivesCoins;
}
