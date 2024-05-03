package org.example;

import java.util.logging.Logger;

public class ExceptionHandling {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ExceptionHandling.class.getName());
        try {
            ExceptionHandling exception = new ExceptionHandling();
            logger.info("Object of ExceptionHandling is created");
//            exception =null;
            exception.division();

        } catch (ArithmeticException e) {

            logger.warning("We catch Airithmetic Exception");
//            System.out.println("We catch Airithmetic Exception");

        } catch (NullPointerException e) {

            System.out.println("We catch NullPointerException");

        } catch (Exception e) {
            System.out.println("We catch Generic Exception");

        }
    }

    public void execptionHandling() {

        System.out.println(1 + 2);

    }

    public void division() {
        int a = 5;
        int b = 0;
        int result = a / b;
        System.out.println("Shweta");
        System.out.println(result);

    }
}
