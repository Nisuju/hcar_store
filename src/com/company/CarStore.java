package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarStore {
    private List<Car> carsInStore = new ArrayList<Car>();

    public void addCar(Car car) throws OutOfFreePlaceException {
        if (carsInStore.size() > 3) {
            throw new OutOfFreePlaceException();
        }
        if (car.calculateCarSize() > 10000) {
            throw new TooBigCarException();
        }

        carsInStore.add(car);
    }

    public void removeCar(Car car) {
        carsInStore.remove(car);
        System.out.println("----------------------------------------------------");
        System.out.println(car.getCarModel() + " has been removed from store");
    }

    public void showAllCars() {
        for (Car car : carsInStore) {
            System.out.println(car);
        }

    }

    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < carsInStore.size(); i++) {
            sum = sum + carsInStore.get(i).getCarPrice();

        }
        System.out.println("The sum of price of all cars in Store is " + sum);
        return sum;


    }


}





