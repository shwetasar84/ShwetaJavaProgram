package org.example;

public class OopsPartEncap {
    public static void main(String[] args) {

        Automobile automobile = new Automobile(20,10);


        Automobile hyundai = new Automobile(20,10);
        Automobile tata = new Automobile(10, 10);
        Automobile merc = new Automobile(100,50);

        hyundai.mileage();
        tata.mileage();
        merc.mileage();
    }
}
