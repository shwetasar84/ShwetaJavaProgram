package org.example;

public class AbsolutValuePart1 {
    public static void main(String[] args) {
        //    {-20, -11, -8, -13, -23} -> Output: {11, 13, 23}

        int[] input = new int[]{-20, -11, -8, -13, -23};

//        for (int i =0; i<input.length;i++){
//
//            if (input[i] % 2 !=0 ){
//                System.out.println(Math.abs(input[i]));
//            }

//
//        }

        int j = 0;
        while (j < input.length) {
//            System.out.println(j);
            if (input[j] % 2 != 0) {
                System.out.println(Math.abs(input[j]));

            }
            j++;
        }

        switch ('A') {
            case 'A':
                System.out.println("You've passed with Grade A");
                break;

            case 'B':
                System.out.println("You've passed with Grade B");

                break;
            default:
                System.out.println("Case Didn't Match");

        }

    }
}
