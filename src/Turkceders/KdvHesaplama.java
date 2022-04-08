package Turkceders;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvli,kdv=0.18;
        Scanner input=new Scanner(System.in);
        System.out.println("urunun tutarini gir");
        tutar=input.nextDouble();
        kdvli=(tutar*kdv)+tutar;
        System.out.println("kdveli fiyat "+ kdvli);
        String durum=(kdvli>250)? "kazik ":"bedava";
        System.out.println(durum);
    }
}
