package com.rcwd.test;

import com.rcwd.test.services.CalculaterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculaterServiceTestJunit5 {

    @Test
    public void addTwoNumbersTest(){
        int actualResults = CalculaterService.addTwoNumbers(12, 5);
       int exceptedResults = 17;

        Assertions.assertEquals(exceptedResults, actualResults, "Test fail!!");
    }

    @Test
    public void sunAnyNumbersTest(){
        int actualResult = CalculaterService.sumAnyNumbers(2, 6, 4, 8, 3);
        int expectedResults = 23;

        Assertions.assertEquals(expectedResults, actualResult, "Test fail!!");
    }
}
