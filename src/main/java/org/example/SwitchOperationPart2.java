package org.example;

import java.util.ArrayList;

public class SwitchOperationPart2 {
    public static void main(String[] args) {

        SwitchOperationPart2 switchOperationPart3 = new SwitchOperationPart2();

        String[] switchSwitch1 = new String[]{"+", "23", "42", "-", "45", "32", "*", "21", "20", "+", "7", "7", "/", "21", "7"};
        ArrayList<String> variablename = new ArrayList<>(); //line 10 is declaration of Array and Line 11 is declaration of ArrayList.

//       System.out.println(switchOperation(Integer.valueOf(switchSwitch1[1]),Integer.valueOf(switchSwitch1[2]),switchSwitch1[0]));

       for (int i =0; i<=switchSwitch1.length-3;i=i+3){

//           System.out.println(switchSwitch1[i]);

           System.out.println(switchOperationPart3.switchOperation(Integer.valueOf(switchSwitch1[i+1]),Integer.valueOf(switchSwitch1[i+2]),switchSwitch1[i]));
       }

    }


    public  double switchOperation(int num1, int num2, String operation) {

        double result = 0;
        switch (operation) {

            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;
            case "/":

                result = num1 / num2;
                break;

            default:
                System.out.println("Operation is not supported");

        }
        return result;
    }

}

