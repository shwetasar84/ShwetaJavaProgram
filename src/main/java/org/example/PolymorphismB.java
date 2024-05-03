package org.example;

public class PolymorphismB {

    public int add(int a, int b) {

        return a + b;
    }

    public int add(int a, int b, int c) {

        return a+b+c;

    }
    public int add(int a, int b, int c, int d) {

        return a+b+c+d;

    }

    public static void main(String[] args) {


        PolymorphismB polymorphismB = new PolymorphismB();

        System.out.println(polymorphismB.add(2,2,4,5));



    }
}
