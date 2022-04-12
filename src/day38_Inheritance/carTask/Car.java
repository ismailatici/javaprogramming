package day38_Inheritance.carTask;

public class Car {
    public String brand,model;
    public int year;
    public String color;
    public double price;
    public int miles;

    public Car(String brand, String model, int year, String color, double price, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.miles = miles;
    }

    public void drive(){
        System.out.println(brand + " " + model+"is driving");
    }

    public void start(){
        System.out.println(brand+" "+model+"is starting");

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
