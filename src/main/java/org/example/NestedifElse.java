package org.example;

import java.sql.SQLOutput;

//Scenario: Determine the grade based on a student's score
public class NestedifElse {

    public static void main(String[] args) {
        int x = 50;
        int y = 80;
        int z = 100;
        int f = 35;
        int m = 20;

        gradeBasedOnScore(x, y, z, f, m);

    }


    public static void gradeBasedOnScore(int x, int y, int z, int f, int m) {

        if (m >= 0 && m < f) {
            System.out.println("You Have Failed");
        } else if (m >= f && m <= x) {
            System.out.println("Your Grade is C");

        } else if (m > x && m <= y) {
            System.out.println("Your Grade is B");
        } else if (m > y && m <= z) {
            System.out.println("Your Grade is A");
        } else {
            System.out.println("Please provide correct input");
        }


//        if (x > y) {
//            if (x > z) {
//
//                System.out.println("Grade C");
//            }
//            if (x > f) {
//                System.out.println();
//            } else {
//                System.out.println();
//            }
//        } else {
//            if (y > z) {
//                System.out.println();
//            } else {
//                System.out.println();
//            }
    }

}
