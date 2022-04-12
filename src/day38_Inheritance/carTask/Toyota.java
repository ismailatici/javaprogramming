package day38_Inheritance.carTask;

public class Toyota extends Car {
    public Toyota(String brand, String model, int year, String color, double price) {
        super("Toyota", model, year, color, price,90);
    }
    public void reliable(){
        System.out.println(brand+" "+model+"is reliable");

    }
}
