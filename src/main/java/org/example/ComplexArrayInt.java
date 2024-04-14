package org.example;

public class ComplexArrayInt {

    public static void main(String[] args) {
        //[200, 400, 600, 800, 1000] //Numbers which are divisible by 10 and 4

        int[] divisbleby10and4 = new int[]{200, 400, 600, 800, 1000,101,104};
        System.out.println("Numbers divisible by both 10 and 4 : ");

        for (int i =0; i< divisbleby10and4.length;i++ ){

            if (divisbleby10and4[i] % 10 == 0 && divisbleby10and4[i]%4 !=0){
                System.out.println(divisbleby10and4[i]);
            }

        }
    }

    }
