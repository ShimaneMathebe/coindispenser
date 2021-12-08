package com.za.assessment.coindispenser.coindispenser.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CoinDispenserServiceTest {

    @InjectMocks
    CoinDispenserService coinDispenserService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getCoinCombinationTest() {
        int coins[] = {1, 2, 3, 5};
        int Y = 11;

        int response = coinDispenserService.minCoins(coins, Y);
        Assert.assertEquals(3, response);

    }
}
