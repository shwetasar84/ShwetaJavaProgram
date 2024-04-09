package org.example;

public class RemoveableCharacter {
    public static void main(String[] args) {

        String characterString = "Stability";

        char[] charArrays = characterString.toCharArray();

        for (int i = 0; i <= charArrays.length - 1; i++) {

            System.out.println(charArrays[i]);

            for (int j = i + 1; j < charArrays.length; j++) {

                System.out.println("Value of J " + charArrays[j]);

//                if (charArrays[i] == Character.toUpperCase(charArrays[j])) {
                if (Character.toLowerCase(charArrays[i]) == Character.toUpperCase(charArrays[j])) {

                    System.out.println("Common Value within String : " + charArrays[i]);
                }


            }
        }

    }
}
