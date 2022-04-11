package day38_Inheritance.carTask;

import day38_Inheritance.Car;

public class Tesla extends Car {

    public Tesla(String brand, String model, int year, String color, double price, int miles) {
        super("Tesla", model, year, color, price, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+"is reliable");
    }
}

