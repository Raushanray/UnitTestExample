package com.rcwd.test;

import com.rcwd.test.services.CalculaterService;
import org.junit.jupiter.api.*;

public class CalculaterServiceTestJunit5 {

    //execute the logic before all the test case

    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic :");
    }

    //execute the logic After all the test case
    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test case logic :");
    }

    //Before all the test case
    @BeforeEach
    public void beforeEachTestCase(){
        System.out.println("Before each");

    }

    //After all the test case
    @AfterEach
    public void afterEachTestCase(){
        System.out.println("After each");

    }



    @Test
    @DisplayName("This is Custom name")
    public void addTwoNumbersTest(){
        System.out.println("First test case:");
        int actualResults = CalculaterService.addTwoNumbers(12, 5);
       int exceptedResults = 17;

        Assertions.assertEquals(exceptedResults, actualResults, "Test fail!!");
    }

    @Test
    @Disabled
    public void sunAnyNumbersTest(){
        System.out.println("Second test case:");
        int actualResult = CalculaterService.sumAnyNumbers(2, 6, 4, 8, 3);
        int expectedResults = 23;

        Assertions.assertEquals(expectedResults, actualResult, "Test fail!!");
    }

//    @Tag()
//    @Nested
}
