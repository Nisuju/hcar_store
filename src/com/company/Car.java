package com.company;


public abstract class Car {

    protected String carModel;
    protected int carPrice;
    protected int length;
    protected int width;
    protected int height;

    public Car(String carModel, int carPrice) {
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public int calculateCarSize() {
        int carSize = length + width + height;
        return carSize;
    }


    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carPrice=" + carPrice +
                '}';
    }
}
