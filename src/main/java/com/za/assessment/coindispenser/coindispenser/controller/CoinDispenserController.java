package com.za.assessment.coindispenser.coindispenser.controller;

import com.za.assessment.coindispenser.coindispenser.service.CoinDispenserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/coindispenser")
public class CoinDispenserController {

    @Autowired
    CoinDispenserService coinDispenserService;

    @GetMapping
    public String getCoinCombinations() {

        int coins[] = {1, 2, 3, 5}; // coin denominations
        int Y = 11; // amount needs to be paid out

        return "Minimum combination of coins required to make change for R" + Y + " is " +
                coinDispenserService.minCoins(coins, Y) + "x coins";
    }
}
