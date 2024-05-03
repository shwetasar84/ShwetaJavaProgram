package org.example;

public class OopsCompileTimePolymorphismEg {

    public static void main(String[] args) {

        CompileTimePolymorphismEg oopsPolymorphismA = new CompileTimePolymorphismEg();

        oopsPolymorphismA.performAddOperation("Toyo ",2);
        oopsPolymorphismA.performAddOperation(3,2);
        oopsPolymorphismA.performAddOperation(3,"Hello");
        oopsPolymorphismA.performAddOperation("Oops","Hyundai");

    }
}
