package com.jmaka;

import com.jmaka.service.CarService;
import com.jmaka.model.Car;

public class Main{
    public static void main(String[] args) {
        final CarService carService = new CarService();
        for (int i =0; i < 3; i++){
            final Car car = carService.create();
            carService.print(car);
        }
    }
}
