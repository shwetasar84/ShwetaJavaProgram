package org.example;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        int[] sizeofarray = new int[5];
        System.out.println(Arrays.toString(sizeofarray));
        sizeofarray[0] = 1;
        sizeofarray[1] = 5;
        sizeofarray[3] = 10;
        System.out.println(Arrays.toString(sizeofarray));
//        System.out.println(sizeofarray.length);
//        System.out.println(sizeofarray[12]);

    }


}
