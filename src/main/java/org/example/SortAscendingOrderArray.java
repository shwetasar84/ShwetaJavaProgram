package org.example;

public class SortAscendingOrderArray {
    public static void main(String[] args) {

        int[] integerorder = new int[]{1,2,5,8,10,11};
        int newintbox;

        for (int i =0; i<integerorder.length-1; i++){

            for (int j =i+1; j< integerorder.length; j++) {

                if (integerorder[i]>integerorder[j]) {
                    newintbox = integerorder[i];
                   integerorder[i] = integerorder[j];
                   integerorder[j] = newintbox;

                }
            }


        }
    }
}
