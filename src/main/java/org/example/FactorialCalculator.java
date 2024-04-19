package org.example;

import java.util.Random;

public class FactorialCalculator {
    public static void main(String[] args) {

        int num = 6;
        int factorial = 1;

        for (int j = num; j >= 1; j--) {

            factorial = factorial * j;

        }
        System.out.println("Factorial of " + num + ":" + factorial);
    }

}