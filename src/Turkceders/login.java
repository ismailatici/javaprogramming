package Turkceders;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String kadi,parola;
        System.out.println("kullanici adi giriniz");
        kadi= scan.nextLine();
        System.out.println("paralo gir");
        parola=scan.nextLine();
        if (kadi.equals("java")&&parola.equals("123")){
            System.out.println("basarili giris yaptin");
        }else {
            System.out.println("yanlislik var");
        }

    }
}
