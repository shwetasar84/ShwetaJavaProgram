package org.example;

public class Automobile {

    private int distance;
    private int petrolPrice;


    public Automobile(int distance, int petrolPrice) {
        this.distance = distance;
        this.petrolPrice = petrolPrice;
    }


    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPetrolPrice() {
        return petrolPrice;
    }

    public void setPetrolPrice(int petrolPrice) {
        this.petrolPrice = petrolPrice;
    }

    //method

    public void mileage() {

        System.out.println(distance / petrolPrice);

    }
}


