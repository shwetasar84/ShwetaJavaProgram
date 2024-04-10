package org.example;

public class ArrayDay3 {

    public static void main(String[] args) {

//        String[] fivefruits = new String[]{"apple", "banana", "cherry", "dragonfruit" , "eggplant", "fig" };

//        int[] fivefruits = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] printawkwardnumbers = new int[]{1,2,3,4,5,6,7,8,9,10}; //Output = [1,4,7,10]

        for (int i =0; i<printawkwardnumbers.length; i=i+=3) //i++ = i+1
            System.out.println(printawkwardnumbers[i]);

//        char[] fivefruits = new char[]{'S','h','w','e','t','a'};

//        System.out.println(fivefruits[0] + " - " + fivefruits[1] + " - " + fivefruits[2] + " - " + fivefruits[3]);
//
//        for (int i = 0; i < fivefruits.length; i++) {
//
//            if (i % 2 == 0) {
//                System.out.print(fivefruits[i] + " + ");
//            } else if (i== fivefruits.length-1) {
//                System.out.print(fivefruits[i]);
//            } else {
//                System.out.print(fivefruits[i] + " - ");
////            }
//        }
//        System.out.println(fivefruits[7]);

    }


}
