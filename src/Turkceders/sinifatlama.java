package Turkceders;

import java.util.Scanner;

public class sinifatlama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int turkce,matematik,sosyal,beden;
        double ortalama=0;
        System.out.println("\nturkce notu giriniz");
        turkce= scan.nextInt();
        System.out.println("\nmatematik notu giriniz");
        matematik=scan.nextInt();
        System.out.println("\nSosyal notu giriniz");
        sosyal= scan.nextInt();
        System.out.println("\nbeden notu giriniz");
        beden=scan.nextInt();
        ortalama=(turkce+matematik+sosyal+beden)/4;
        if (ortalama<50){
            System.out.println("kaldin seneye tekrar");
        } else if (ortalama>50){
            System.out.println("gectin hadi bakalim");
        }
        System.out.println("ortalaminiz="+ortalama);



    }
}
