package day38_Inheritance.carTask;

import day38_Inheritance.Car;

public class Toyota extends Car {
    public Toyota(String brand, String model, int year, String color, double price) {
        super("Toyota", model, year, color, price, miles);
    }
    public void reliable(){
        System.out.println(brand+" "+model+"is reliable");

    }
}
