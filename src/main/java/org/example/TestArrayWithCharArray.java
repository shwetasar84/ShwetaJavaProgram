package org.example;

public class TestArrayWithCharArray {
    public static void main(String[] args) {

        testMethod("We are Learning Testing", 'T');

    }


    public static void testMethod(String abc, char s) {
        char[] abcArray = abc.toCharArray();
        int counter = 0;

        for (int i = 0; i < abcArray.length; i++) {
            if (Character.toUpperCase(abcArray[i]) == Character.toUpperCase(s)) {
                counter++;
            }

        }
        System.out.println(s + " is repeating : " + counter + " times");
    }

    public static void countOfCharacter() {

    }
}

