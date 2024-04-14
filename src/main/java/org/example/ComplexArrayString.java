package org.example;

public class ComplexArrayString {
    public static void main(String[] args) {
//        ["ABC", "PQR", "ABCD", "XYZ"]
//        ABCD
//        WAP from given String of Array return String having length 4

        String[] lengthoffour = new String[]{"ABC", "PQR", "ABCD", "MANGO", "XYZ", "GOOD"};
        for (int i = 0; i < lengthoffour.length; i++) {
            if (lengthoffour[i].length() == 4) {
                System.out.println(lengthoffour[i]);
            }
        }
//        String[] matchingArray = new String[]{"You", "Are", "Student", "of", "my", "batch", "52"};
        String[] matchingArray = new String[]{"I", "AM", "Tech", "Test"};

        matchingLengthOfArray(matchingArray);
    }

    public static void matchingLengthOfArray(String[] lengthofArray) {

        int count = 0;

//        ["You", "Are", "Student", "of", "my", "batch", "52"]
//       Answer: Student
//["I", "AM", "Teaching", "Test"]

        for (int i = 0; i < lengthofArray.length; i++) {
            if (lengthofArray[i].length() == lengthofArray.length) {
                System.out.println(lengthofArray[i]);
                count = count + 1;
            }

        }
        System.out.println(count);
        if (count == 0)
        {
            System.out.println("No Matching Data Found");
        }
    }
}
