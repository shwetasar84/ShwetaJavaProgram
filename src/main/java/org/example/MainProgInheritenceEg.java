package org.example;

public class MainProgInheritenceEg {

    public static void main(String[] args) {
        ChildInheritanceEg.multiply();

        //java compiler will first check in child class if the method is present in child class , if yes, it willl excecute that else it will go and check in parent class.
    }
}
