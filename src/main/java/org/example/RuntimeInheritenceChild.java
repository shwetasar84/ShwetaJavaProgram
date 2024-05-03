package org.example;

public class RuntimeInheritenceChild extends RuntimeInheritenceParent{

    @Override
    public int add(int num1, int num2) {
        return Math.abs(num1) +Math.abs(num2);
    }
}
