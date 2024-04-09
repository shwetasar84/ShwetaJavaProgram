package org.example;

import java.util.Arrays;

public class ArrayBasicTest {
    public static void main(String[] args) {

        //create a array of size 5000 then assign 20 at 100th position, 50 at 500th position and 100 at 2500th position

//        int[] newarraysize = new int[5000];

//        String[] declare = new String[10];
//        char[] declare1 = new char[]{'S', 'h', 'w', 'e', 't', 'a'}; //character array
        printchar('n');

        char singlechar = 's'; //single character

//        System.out.println(Arrays.toString(newarraysize));
//        newarraysize[100] = 20;
//        newarraysize[500] = 50;
//        newarraysize[2500] = 100;
//
//        System.out.println(declare1[7]);

//        //Steps:
////        1) fetching initialised valriable, i=0
////                2) it'll check for condition. 0<6
////            3) if condition is true then it will execute all commands within for loop. printing value.
////        4) increment the i(i++), i =1.
//        5) go to step 2 and continues from there.
//        print10times(10);
//        printLength("Testing");

//        for (int i = 0; i < declare1.length-1; i++) {
//
////            System.out.println(declare1[i]);
//
//
//        }

//        System.out.println(Arrays.toString(newarraysize));

//        System.out.println(newarraysize.length);
//
//        System.out.println(newarraysize[2500]);

    }

    public static void print10times(int num){

        for (int j =0; j<num; j++) {

            System.out.println("Print 5X3 = 15");
        }

    }

    public static void printLength(String abc){
        for (int m= 0; m<abc.length();m++){
            System.out.println("I am Learning Testing");
        }
    }

    public static void printchar(char n){

        for(int k =0; k<1; k++){
            System.out.println(k);
        }
    }

}

