package org.example;

public class OopsEncap {
    public static void main(String[] args) {

        Student student = new Student(10, "Shweta");
//        int id = student.getId();

//        student.setId(30);
//        id = student.getId();
        System.out.println(student.getName() + " " + student.getId());


//********************************************************************
        Area area = new Area();
        System.out.println(area.getLen() + " " + area.getWidth());
        System.out.println(area.getResult());
        area.setLen(10);
        area.setWidth(20);

//        area.getRectabgularArea();
        area.getSquareArea();
        //********************************************************************

        Area area1 = new Area();
        Area area2 = new Area();
        Area area3 = new Area();
        Area area4 = new Area();


        area1.setLen(2);
        area1.setWidth(4);
        area2.setLen(3);
        area2.setWidth(6);
        area3.setLen(4);
        area3.setWidth(2);
        area4.setLen(2);
        area4.setWidth(4);

        area.getRectabgularArea();
        area1.getRectabgularArea();
        area2.getRectabgularArea();
        area3.getRectabgularArea();
        area4.getRectabgularArea();


    }
}
