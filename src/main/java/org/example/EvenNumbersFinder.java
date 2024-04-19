package org.example;

public class EvenNumbersFinder {

    public static void main(String[] args) {
        int[] evenNumbers = new int[]{1,2,3,4,5,6,7,8,9,10,22,24,28,32,133,43,54,55,87};

        for (int i =0; i < evenNumbers.length; i++){

            if (evenNumbers[i] % 2 == 0){
                System.out.println(evenNumbers[i]);
            }
        }
    }
}
