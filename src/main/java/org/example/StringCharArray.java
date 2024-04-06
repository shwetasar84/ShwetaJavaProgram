package org.example;

public class StringCharArray {
    public static void main(String[] args) {

//        String stringarray;
//        stringarray="Shweta";

        //char[] because you want to access each character fromt he string thats why we use char[]

        String stringarray = "Shweta is my name";
        char[] returnName = stringarray.toCharArray(); //this method is converting string into character array.

        for(int i =0; i<returnName.length; i++){
            System.out.print(returnName[i]  + " ");
        }

    }
}
