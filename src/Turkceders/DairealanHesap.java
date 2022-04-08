package Turkceders;

import java.util.Scanner;

public class DairealanHesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                int r;
        double alan,hacim,pi=3.14;
        System.out.println("Daire yaricapi gir:\n");
        r=input.nextInt();
        alan=2*pi*r;
        hacim=alan*(2+pi);
        System.out.println("alan: "+alan);
        System.out.println("hacim:" +hacim);









    }
}
