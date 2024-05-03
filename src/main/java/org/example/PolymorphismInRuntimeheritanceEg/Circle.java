package org.example.PolymorphismInRuntimeheritanceEg;

public class Circle extends ShapeParentPolyRuntimeInherit {

    public double multiply(double num1 , int num2){

        return Math.abs(num1) * Math.abs(num2);

    }
}

//method overriding can happen in different classes with same data type
//method overloading happens in same class with different parameters