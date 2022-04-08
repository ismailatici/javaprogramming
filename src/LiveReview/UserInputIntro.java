package LiveReview;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {
        String name ="";
        System.out.println("output");
        Scanner input =new Scanner(System.in);
        System.out.println("10/3 :"+10/3);
        int num1=10;
        double num2=3.0;
        int result = (int) (num1/num2);
        System.out.println("result =" +result);

        int year=2022;
        String make="audi";
        String model="A7";
        boolean transmission =true;
        String color="black";
        int milage =0;
        int price=75000;
        double preiceinTl=price*15.5;
        double taxrate=1.8;
        double priceafterTaxintl=preiceinTl+(preiceinTl*taxrate);
        System.out.println("priceafterTaxinTl=" +priceafterTaxintl);

                












    }
}
