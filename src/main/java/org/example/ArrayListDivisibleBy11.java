package org.example;

public class ArrayListDivisibleBy11 {
    public static void main(String[] args) {

        //if we want to access the value of an array then always give variablename[position] eg: like , divisibleby11[0]
        //if you want to access the position of an array then you can directly fetch through variable i.
        int[] divisibleby11 = new int[]{32, 44, 11, 9, 12, 99};

        String returnMyName = "Shweta";
        int returMyAge = 39;

        String[] returnNames = new String[]{"Mandy", "Manu", "Sam"};

//        for (int i = 0; i < 3; i++) {
//            System.out.println(divisibleby11[i]);
//
//        }

        arrayDIisibleby11(divisibleby11);
    }
    public static void arrayDIisibleby11(int[] xyz) {

        for (int i = 0; i < xyz.length; i++) {

            if (xyz[i] % 11 == 0) {
                System.out.print(xyz[i] + ",");
            }
        }

    }
}
