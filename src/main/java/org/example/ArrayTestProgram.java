package org.example;

public class ArrayTestProgram {
//    [10, 20, 50, 40]
//    find total no of  values present in array which is between 15 and 51
//            3

    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 50, 40};
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= 15) {
                count++;
            }

        }
        System.out.println(count);
    }

}
