package com.company;


import static com.company.Car.*;

public class Main {

    public static void main(String[] args) {
        Ford car1 = new Ford("FordFocus", 15000, 5000, 1000, 2000);
        Tesla car2 = new Tesla("TeslaModelS", 75000, 5000, 1500, 1400);
        Toyota car3 = new Toyota("ToyotaCamry", 30000, 5000, 1500, 1400);
        Hunday car4 = new Hunday("HundayAccent", 17000, 5000, 2000, 2000);
        Bentley car5 = new Bentley("BentleyBentayga", 150000, 9000, 1500, 1400);

        CarStore carStore = new CarStore();

        try {
            carStore.addCar(car1);
            carStore.addCar(car2);
            carStore.addCar(car3);
            carStore.addCar(car4);
            carStore.addCar(car5);

        } catch (TooBigCarException e) {
            System.out.println("Could not add a car, it is too big");
        } catch (OutOfFreePlaceException e) {
            System.out.println("Could not add a car, out of place");
        }


        carStore.showAllCars();


        carStore.calculateSum();


    }
}
