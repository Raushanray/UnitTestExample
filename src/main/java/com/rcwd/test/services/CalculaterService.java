package com.rcwd.test.services;

public class CalculaterService {
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }
    public static int productTwoNumbers(int a, int b){
        return a*b;
    }
    public static int devideTwoNumbers(int a, int b){
        return a/b;
    }
    public static int sumAnyNumbers(int ...numbers){
        int s =0;
        for (int n:numbers){
            s+=n;
        }
        return s;
    }
}
