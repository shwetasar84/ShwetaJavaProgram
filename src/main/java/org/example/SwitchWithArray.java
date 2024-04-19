package org.example;

public class SwitchWithArray {

    //    ['23', '42', '+']
    public static void main(String[] args) {

        String[] switchSwitch = new String[]{"23", "42", "+", "45", "32", "+", "45", "32", "+"};


        System.out.println(switchMe(Integer.valueOf(switchSwitch[1]), Integer.valueOf(switchSwitch[2]), switchSwitch[0]));
        System.out.println(switchMe(Integer.valueOf(switchSwitch[4]), Integer.valueOf(switchSwitch[5]), switchSwitch[3]));

//        Integer.valueOf(switchSwitch[0]) ; //convert string into Integer value
//        Integer.valueOf(switchSwitch[1]);
//        String[] switchSwitch1 = new String[]{"23", "42", "+", "45", "32", "-"};
//        System.out.println(switchMe(Integer.valueOf(switchSwitch1[0]), Integer.valueOf(switchSwitch1[1]), switchSwitch1[2]));
//        System.out.println(switchMe(Integer.valueOf(switchSwitch1[3]), Integer.valueOf(switchSwitch1[4]), switchSwitch1[5]));

//        System.out.println("Below output is from Hardcorded Print Statement :");

//        System.out.println(switchMe(Integer.valueOf(switchSwitch[0]), Integer.valueOf(switchSwitch[1]), switchSwitch[2]));
//        System.out.println(switchMe(Integer.valueOf(switchSwitch[3]), Integer.valueOf(switchSwitch[4]), switchSwitch[5]));
//        System.out.println(switchMe(Integer.valueOf(switchSwitch[6]), Integer.valueOf(switchSwitch[7]), switchSwitch[8]));
//        System.out.println("Below output is from For Loop :");

        for (int i = 0; i <= switchSwitch.length - 3; i = i + 3) {

            System.out.println(switchMe(Integer.valueOf(switchSwitch[i+1]), Integer.valueOf(switchSwitch[i + 2]), switchSwitch[i]));


        }

    }

    public static int switchMe(int num1, int num2, String operation) {

        int result = 0;

        if (operation == "+") {
            result = num1 + num2;
        } else if (operation == "-") {
            result = num1 - num2;

        } else {
            System.out.println("Operation not suppported");
        }
        return result;
    }
//['23', '42', '+', '45', '32', '+', '45', '32', '+']
    //wether any change is required from line 16-27 ?
    //how will you handle this inout ?

    //['23', '42', '+', '45', '32', '-']
//wether any change is required from line 16-27 ?
    //how will you handle this inout ?


}
