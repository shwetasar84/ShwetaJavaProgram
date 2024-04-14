package org.example;

import java.util.Arrays;

public class RotatingArrays {
           public static void main(String[] args) {
//
//        {1, 2, 3, 4, 5, 6, 7}
//        int p = 2

            int[] rotatingarray = new int[]{1, 2, 3, 4, 5, 6, 7};

            int[] emptyarray = new int[rotatingarray.length];

            int j = 0;

            for (int i = 2; i < rotatingarray.length; i++) {
                emptyarray[j] = rotatingarray[i];
                j = j+1;

            }
            System.out.println(Arrays.toString(rotatingarray));
            System.out.println(Arrays.toString(emptyarray));

            for (int i =0;i<2;i++){
                emptyarray[j] = rotatingarray[i];
                j=j+1;
            }
               System.out.println(Arrays.toString(rotatingarray));
               System.out.println(Arrays.toString(emptyarray));

           }

    }
