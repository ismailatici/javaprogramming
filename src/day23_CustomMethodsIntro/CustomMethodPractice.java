package day23_CustomMethodsIntro;

public class CustomMethodPractice {
    public static void main(String[] args) {
        helloWorld5times();
        x();
        cift();
    }
    public static void helloWorld5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }

    }
    public static void x(){
        for (int j = 0; j < 5; j++) {
            System.out.println("Hello Cydeo");

        }
    }
    public static void cift(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.println(i);

        }
    }
}
