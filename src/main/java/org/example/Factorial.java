package org.example;

public class Factorial {
    public static void main(String[] args) {

        int num =12;
        int factorial = 1;

        for (int i =num; i>=1; i--){

            factorial=factorial*i;

        }
        System.out.println("Factorial of " + num + ":" + factorial);
    }
}
