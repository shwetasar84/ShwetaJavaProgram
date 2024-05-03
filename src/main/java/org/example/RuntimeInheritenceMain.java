package org.example;

public class RuntimeInheritenceMain {
    public static void main(String[] args) {

        RuntimeInheritenceParent runtimeInheritenceParent = new RuntimeInheritenceParent();
        RuntimeInheritenceChild runtimeInheritenceChild = new RuntimeInheritenceChild();

        RuntimeInheritenceParent runtimeInheritenceParent1 = new RuntimeInheritenceChild();
//        RuntimeInheritenceChild runtimeInheritenceChild1 = (RuntimeInheritenceChild) new RuntimeInheritenceParent();

        System.out.println(runtimeInheritenceParent.add(-7,-100.30));
        System.out.println(runtimeInheritenceChild.add(-7.10,-3));
        System.out.println(runtimeInheritenceParent1.add(20.08,-3));
//        runtimeInheritenceChild1.add(-7,-3);

    }
}
