package org.example;

public class SumTill100 {

    public static void main(String[] args) {

        int[] SumOf100 = new int[]{10, 20, 50, 19, 100};
//        String[] StringName = new String[]{"a", "b", "c", "d"};
        WhileLoopSumOf100(SumOf100);

    }

    public static void WhileLoopSumOf100(int[] abc) {
        int sum1 = 0;
        for (int i = 0; i < abc.length; i++) {
            sum1 = sum1 + abc[i];
            if (sum1 > 100) {
                System.out.println(abc[i]);
                break;
            }
            System.out.println(abc[i]);
        }

    }
}


