package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 =+25;
        int num2 =-25;
        System.out.println(num1<0);
        System.out.println(num2>0);
        int v=67;
        System.out.println(v--);
        System.out.println(v--);
        double num3 =100.0;
        num3 %=3;
        System.out.println("num3 = " + num3);


    }
}
