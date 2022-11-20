package com.jmaka.model;

import java.util.Random;
import java.util.UUID;

public class Car {
    String manufacturer;
    String engine;
    String color;
    int count;
    int price;
    String id;

    Random random = new Random();

    public Car(){
        this.id = UUID.randomUUID().toString();
    }

    public Car(String manufacturer, String engine, String color){
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        this.count = 1;
        this.price = random.nextInt(1000);
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
