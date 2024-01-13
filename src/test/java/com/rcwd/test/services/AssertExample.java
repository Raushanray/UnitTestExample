package com.rcwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

//    Assertion : Validate actual result to expected result
//    Assertions class


    @Test
    public void test1() {

        System.out.println("Testing some assertion method:");

//        int actual = 12;
//        int expected = 12;

//        double actual = 12;
//        double expected = 12;
//        byte actual = 12;
//        int expected = 12;

        float actual = 12.3F;
        Float expected = 12.3f;

        //overloaded method
        Assertions.assertEquals(expected, actual);

        int[] actualResults = {1, 2, 3, 4, 5, 6};
        int[] expectedResults = {1, 2, 3, 4, 5, 6};

//        int []actualResults = {1,2,3,4,5,6};
//        double []expectedResults = {1,2,3,4,5,6}; Differ type is not allowed
        Assertions.assertArrayEquals(expectedResults, actualResults);

//        String actualName = new String("Ravi");
//        String expectedName = new String("Ravi"); //both are different

        String actualName = "Ravi";
        String expectedName = "Ravi";
        Assertions.assertSame(expectedName, actualName);

        //here wreite some important method
//        Assertions.assertNotSame();
//        Assertions.assertNotNull();
//        Assertions.assertNull();
//        boolean b =true;
//        Assertions.assertTrue(b);
//        Assertions.assertFalse();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        Assertions.assertIterableEquals(list2, list1);


        Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("this is testing exception");
        });

//        Assertions.assertThrows(RuntimeException.class, ()->{
//            System.out.println("this is testing exception");
////            throw new RuntimeException("this is testing exception");
//        });


    }


}
