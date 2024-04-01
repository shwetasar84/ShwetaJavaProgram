package org.example;

public class TestEvenOrOdd {

    public static void main(String[] args) {

        System.out.println(checkEvenOrOdd(50));

    }

    public static boolean checkEvenOrOdd(int m) {


        if (m % 2 == 0) {

            return true;
        } else {
            return false;
        }


    }
}