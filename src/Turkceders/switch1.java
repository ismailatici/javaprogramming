package Turkceders;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi= scan.nextInt();
        switch (sayi){
            case 1:
                System.out.println("sayi 1 e esittir");
                break;
            case 2:
                System.out.println("sayi 2 ye esittir");
                break;
            case 3:
                System.out.println("sayi 3 e esit");
            default:
                System.out.println("gecersiz sayi girdiniz");

        }

    }
}
