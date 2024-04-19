package org.example;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(calculateMe(4,4, "multiply"));


    }

    public static double calculateMe(int num1, int num2, String operation) {

       double result = 0;

        switch (operation.toUpperCase()) {

            case "ADD":
                result = num1 + num2;

                break;

            case "MULTIPLY":
                result = num1 * num2;
                break;

            case "SUB":
                result = num1 - num2;
                break;

            case "DIVIDE":

                result = num1 / num2;

                break;

            case "SQUARE":

                result = num1 * num1;

                break;

            case "SQUAREROOT":

                result =  Math.sqrt(num1);

                break;

            default:
                System.out.println("Operation not supported ");

        }
        return result;

    }
}
