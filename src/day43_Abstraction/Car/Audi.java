package day43_Abstraction.Car;

public final class Audi extends Car{
    public Audi(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void start() {
        System.out.println("Pusch the start button");
    }
    public void autopark(){
        System.out.println(getBrand()+" "+getModel()+"has auto park feature");
    }
}
