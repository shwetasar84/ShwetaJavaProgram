package org.example;

public class RemoveCharacter {
    public static void main(String[] args) {

        String charString = "Testing";

        char[] charArray = charString.toCharArray();

        for (int i = 0; i <= charArray.length - 1; i++) //i=0
        {
//            System.out.println("Value of i " + charArray[i]);
            for (int j = i + 1; j < charArray.length; j++) { //j=i+1 and i=0 so j =1
//                System.out.println("Value of J " + charArray[j]);
                if (charArray[i] == Character.toUpperCase(charArray[j]))
//                    if (Character.toLowerCase(charArray[i]) == Character.toUpperCase(charArray[j]))
                {
                    System.out.println("Common Value within String : " + charArray[i]);
                }

            }
        }

    }
}
