package Turkceders;

import java.util.Scanner;

public class Notortalama {
    public static void main(String[] args) {
        int quiz,vize,ffinal;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("quiz notunu gir ");
        quiz=input.nextInt();
        System.out.println("vizeyi gir");
        vize=input.nextInt();
        System.out.println("ffinal i gir");
        ffinal=input.nextInt();
        ortalama=(quiz*0.2)+(vize*0.35)+(ffinal*0.45);
        System.out.println("Not ortalamaniz "+ortalama);
        String sonuc=(ortalama>=50)?"gectiniz":"kaldiniz";
        System.out.println(sonuc);







    }
}
