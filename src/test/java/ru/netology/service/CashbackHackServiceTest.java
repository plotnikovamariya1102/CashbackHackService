package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @org.junit.Test
    public void showBelowBoundary(){
        int purchaseAmount = 500;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 500;
        assertEquals(actualResult, expectedResult);

    }
    @org.junit.Test
    public void showHigherBoundary(){
        int purchaseAmount = 1500;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 500;
        assertEquals(actualResult, expectedResult);

    }@org.junit.Test
    public void showNullBoundary(){
        int purchaseAmount = 0;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 1000;
        assertEquals(actualResult, expectedResult);

    }
    @org.junit.Test
    public void showEqualBoundary(){
        int purchaseAmount = 1000;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 0;
        assertEquals(actualResult, expectedResult);

    }

}
