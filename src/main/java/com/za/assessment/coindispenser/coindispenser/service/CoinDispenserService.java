package com.za.assessment.coindispenser.coindispenser.service;

import org.springframework.stereotype.Service;

@Service
public class CoinDispenserService {

    CoinDispenserService() {
    }

    public int minCoins(int coins[], int Y) {
        // base case
        if (Y == 0) return 0;

        // Initialize result
        int res = Integer.MAX_VALUE;

        // Try every coin that has smaller value than V
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= Y) {
                int sub_res = minCoins(coins, Y - coins[i]);

                // Check for INT_MAX to avoid overflow and see if
                // result can minimized
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }
}
