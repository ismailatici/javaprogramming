package day32_Constructor;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car("toyota");
        Car car2=new Car("Honda","Accord");
        Car car3=new Car("Lexus","RX350",2011);
        Car car4=new Car("BMW","X",2020,5000);
        Car car5=new Car("Tesla","fg",2000,30000,"Mavi");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
