package com.company;


import static com.company.Car.*;

public class Main {

    public static void main(String[] args) {
        Ford car1 = new Ford("FordFocus", 15000);
        Tesla car2 = new Tesla("TeslaModelS", 75000);
        Toyota car3 = new Toyota("ToyotaCamry", 30000);
        Hunday car4 = new Hunday("HundayAccent", 17000);
        Bentley car5 = new Bentley("BentleyBentayga", 150000);

        CarStore carStore = new CarStore();

        try{
            carStore.addCar(car1);
            carStore.addCar(car2);
            carStore.addCar(car3);
            carStore.addCar(car4);
            carStore.addCar(car5);

        } catch (OutOfFreePlaceException e){
            System.out.println("Could not add a car");
        }


        carStore.showAllCars();

        carStore.removeCar(car5);

        carStore.calculateSum();


    }
}
