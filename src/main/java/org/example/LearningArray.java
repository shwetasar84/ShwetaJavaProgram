package org.example;

public class LearningArray {

    public static void main(String[] args) {

        int[] numArray = new int[10];
//        System.out.println(numArray[0]);
//        System.out.println(numArray[1]);
//        System.out.println(numArray[2]);
//        System.out.println(numArray[3]);
//        System.out.println(numArray[4]);

//        for( int i = 0;i<numArray.length + 1 ;i++){
//            System.out.println("Position of list: " + i);
////            System.out.println(numArray[i]);
//        }

        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println("Position of list: " + i);
//            System.out.println(numArray[i]);
        }
        evenPosition();
    }
    public static void evenPosition() {

        int[] newArrayList = new int[]{10, 32, 45, 21, 20, 42};

        for (int i = 0; i < 6; i++) {
//            System.out.println(newArrayList[i]);

           //find out the number which are at even position

//            if(i%2!=0) {
//                System.out.println(newArrayList[i]);

//            //find out the number which are even in given array
//            if (newArrayList[i] % 2 == 0) {
//                System.out.println(newArrayList[i]);
//                            }

            //find out the number which are odd in given array
            if (newArrayList[i] % 2!=0) {
                System.out.println(newArrayList[i]);
            }

        }


    }

}


