package org.example.PolymorphismInRuntimeheritanceEg;

public class MainShapeParentPolyRuntimeInherit {

    public static void main(String[] args) {

        ShapeParentPolyRuntimeInherit mainClass = new ShapeParentPolyRuntimeInherit(); //creating an obj of parent class with ref to parent
        ShapeParentPolyRuntimeInherit circle = new Circle(); //creating an object of parent class with ref to child


        Circle childCircle = new Circle();  //creating an object of child with ref to child
        Rectangle childRectangle = new Rectangle();
        Triangle childTriangle = new Triangle();



        System.out.println(childCircle.multiply(-4.40,40)); //calling a method multiply with an object of child class with ref to child
        System.out.println(childRectangle.multiply(-2,-3));
        System.out.println(childTriangle.multiply(0,-9.99));
        System.out.println(circle.multiply(-1.2,2)); //calling multiply method with an object of child class with ref to parent
        System.out.println(mainClass.multiply(3,4)); //calling multiply method with an object of parent class with ref to parent
    }


}
