//package com.rcwd.test.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculaterServiceTest {
//
//    int counter = 0;
//
////    @BeforeClass
//
//    @BeforeClass //Before all test cases
//    public static void init(){
//
//        System.out.println("Before all test class: ");
//        System.out.println("Started test : " + new Date());
//    }
//
//    //test method of addTwoNumbers
//    @Test
//    public void addTwoNumbersTest(){
//        for (int i = 1; i <= 20 ; i++) {
//            counter += i;
//        }
//        System.out.println("Test for addTwoNumbersTest");
//        int results = CalculaterService.addTwoNumbers(12, 15);
//        int expected = 27;
//        System.out.println("Counter int first test case : " + counter);
//        Assert.assertEquals(expected, results);
//
//        //actual results
//
//        //expected results
//    }
//
//    @Before //executes the methods before each test case
//    public void beforeEach(){
//        System.out.println("Before each test case :");
//        counter = 0;
//    }
//
//    @Test
//    public void sunAnyNumbersTest(){
//        for (int i = 1; i <= 100 ; i++) {
//            counter += i;
//        }
//        System.out.println("Test for sunAnyNumbersTest");
//        int results = CalculaterService.sunAnyNumbers(2, 6, 4, 8, 3);
//
//        int expectedResult= 23;
//        System.out.println("Counter int second test case : " + counter);
//        Assert.assertEquals(expectedResult, results);
//
//
//    }
//
//    @AfterClass //After all test cases
//    public static void cleanup(){
//        System.out.println("After all test cases:");
//        System.out.println("End test cases : " + new Date());
//    }
//}
