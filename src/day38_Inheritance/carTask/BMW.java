package day38_Inheritance.carTask;

import day38_Inheritance.Car;

public class BMW extends Car {
    public BMW(String brand, String model, int year, String color, double price, int miles) {
        super("BMW", model, year, color, price, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+"brearks down every 100 miles");
    }
    public void racing(){
        System.out.println(brand+" "+model+"is a racing");
    }
}
