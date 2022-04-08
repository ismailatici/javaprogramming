package Turkceders;

import java.util.Scanner;

public class konsoldanverialma {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b;
        System.out.println("A sayisini giriniz:");
        a= input.nextInt();
        System.out.println("a sayisi"+a);
        System.out.println("B sayisini giriniz");
        b= input.nextInt();
        System.out.println("B sayisi:"+b);
        double c;
        System.out.println("Double turunde sayi giriniz:");
        c=input.nextDouble();
        System.out.println(c);
        String str;
        System.out.println("String giriniz");
        str=input.nextLine();
        System.out.println("Str"+str);




    }
}
