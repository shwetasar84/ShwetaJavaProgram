package org.example;

import java.util.Arrays;

public class TestPrimeNumbers {

    public static void main(String[] args) {

        int[] primeNumbers = new int[]{20, 35, 12, 32, 100, 7};

//        printPrimeNumbers(primeNumbers);
        System.out.println(Arrays.toString(returnPrimeNumbers(primeNumbers)));

//        System.out.println(printPrimeNumbers(primeNumbers));

        //prime numbers between 1-101: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101
    }

    private static void printPrimeNumbers(int[] prime) {

        boolean n = true;

        for (int i = 0; i < prime.length; i++) { //prime.length because prime is an array and length i sa method to get the size of the array.
            n = true;

//            System.out.println("This if for variable i : " + prime[i]);

            for (int j = 2; j < prime[i]; j++) {  //we used prime[i] to get values present on that location,always return me integer,that's why hvnt used length method here.
//                System.out.println("This if for variable j : " + j);
                if (prime[i] % j == 0) {
                    n = false;
                    break;
                }

            }
            System.out.println("Number  " + prime[i] + " is Prime : " + n);

        }


    }

    private static boolean[] returnPrimeNumbers(int[] prime) {

        boolean[] returnBoolean = new boolean[prime.length];

        for (int i = 0; i < prime.length; i++) { //prime.length because prime is an array and length i sa method to get the size of the array.
            returnBoolean[i] = true;


//            System.out.println("This if for variable i : " + prime[i]);

            for (int j = 2; j < prime[i]; j++) {  //we used prime[i] to get values present on that location,always return me integer,that's why hvnt used length method here.
//                System.out.println("This if for variable j : " + j);

                if (prime[i] % j == 0) {
                    returnBoolean[i] = false;
                    break;
                }

            }


        }
        return returnBoolean;
    }
}