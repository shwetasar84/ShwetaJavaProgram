package org.example;

public class Main {
    public static void main(String args[]) {

        int a = 10;
        int b = 10;

        Main mainclass = new Main();
        mainclass.multiplyAndDivide(a < b);
        mainclass.multiplyAndDivide(a > b);

        System.out.println(returnboolean(a, b));

    }

    public static int multiplier(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public void multiplyAndDivide(boolean num) {

        if (num) {
            int multiplier1 = multiplier(10, 10);

            System.out.println("Result Of Multiplier : " + multiplier1);

        } else {
            Main nonstatic = new Main();
            System.out.println(nonstatic.divide(100, 20));
        }
    }

    //this method will return true or false if num1 > num2
    public static boolean returnboolean(int num1, int num2) {

        if (num1 > num2) {
            return true;
        } else if (num1 == num2) {
            return true;

        } else {
            return false;
        }


    }
}
