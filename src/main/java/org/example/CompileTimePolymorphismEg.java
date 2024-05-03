package org.example;

public class CompileTimePolymorphismEg {

    public void performAddOperation(String x, int y) {
        System.out.println(x+y);
    }

    public void performAddOperation(int x, int y) {
        System.out.println(x+y);
    }

    public void performAddOperation(int x, String y){
        System.out.println(x+y);
    }

    public void performAddOperation(String x, String y){
        System.out.println(x+y);
    }

}
