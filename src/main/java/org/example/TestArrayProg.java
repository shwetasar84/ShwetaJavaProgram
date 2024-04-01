package org.example;

public class TestArrayProg {
    public static void main(String[] args) {

        int[] InputArray = new int[]{10, 21, 33, 49};

        arrayDivisibleBy3And7(InputArray);
    }

    public static void arrayDivisibleBy3And7(int[] abc) {

        for(int i =0; i<abc.length; i++){

            if (abc[i] % 3 == 0 && abc[i] % 7 == 0) {
                System.out.println((abc[i]));

            }
        }

    }
}
