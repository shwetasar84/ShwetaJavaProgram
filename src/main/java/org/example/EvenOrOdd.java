package org.example;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println(evenorodd(-31));

    }
    public static boolean evenorodd(int a) {

        if (a % 2 == 0) {
            return true;

        } else {
            return false;
        }
    }
}
