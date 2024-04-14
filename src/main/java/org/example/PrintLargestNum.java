package org.example;

public class PrintLargestNum {
    public static void main(String[] args) {
//        [32, 45, 2, 100, 75, 15]
//Largest Number in the Array

        int[] array = new int[]{10000, 32, 45, 2, 100, 75, 15,-256};



        System.out.println("The laregst number in given array : " + printLargest(array));
        System.out.println("The minimum number in given array : " + printSmallest(array));

    }

    public static int printLargest(int[] array) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int printSmallest(int[] arrays) {

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < arrays.length; j++) {
            if (arrays[j] < min) {
                min = arrays[j];
            }
        }

        return min;
    }

}
