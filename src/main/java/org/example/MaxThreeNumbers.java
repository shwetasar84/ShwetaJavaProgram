package org.example;

public class MaxThreeNumbers {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int m = 55;


        int max = findMaximum(i, j, m);
        System.out.println("Maximum Of Three Numbers : " + max);
    }

    public static int findMaximum(int i, int j, int m) {

        if (i > j) {
            if (i > m) {
                return i;
            } else {
                return m;
            }
        } else {
            if (j > m) {
                return j;
            } else {
                return m;
            }
        }
    }

}