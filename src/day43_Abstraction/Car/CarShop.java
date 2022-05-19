package day43_Abstraction.Car;

public class CarShop {
    public static void main(String[] args) {
        Honda honda=new Honda("honda","Accord","Red",2000,300000);
        Audi audi=new Audi("Audi","Q5","mavi",2020,12000);
        Tesla tesla=new Tesla("tesla","L3","White",2010,34000);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("red");
        audi.setColor("pink");
        tesla.setColor("green");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
    }
}
