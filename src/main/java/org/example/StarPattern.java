package org.example;

public class StarPattern {

    public static void main(String[] args) {

        StarPattern printStars = new StarPattern();

        printStars.returnStars(4, "*");

//        printStars.returnNumberPattern(4, "");


    }

    public void returnStars(int s, String o) {

        for (int i = 1; i <= s; i++) {    //i=1, i=2, i=3

            for (int j = 1; j <= i; j++) { //j<=i
                System.out.print(o);

            }
            System.out.println();
        }

        for (int i = s-1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(o);
            }
            System.out.println();
        }
    }

//    public void returnNumberPattern(int s, String o) {
//
//        for (int i = 1; i <= s; i++) {    //i=1, i=2, i=3
//
//            for (int j = 1; j <= i; j++) { //j<=i
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i >= s; i--) { //j<=i
//            System.out.print(s);
//        }
//        System.out.println();
//    }

}
