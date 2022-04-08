package Turkceders;

import java.util.Scanner;

public class hesapmakinasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, toplam, cikar, bol, carp, secim;

        System.out.println("Lütfen sayi1 giriniz");
        sayi1 = scan.nextInt();
        System.out.println("lütfen sayi2 i giriniz");
        sayi2 = scan.nextInt();

        System.out.println("yapmak istediniz islami secin\n1-toplama\n2-cikarma\n3-bolme\n4-carp");
        secim = scan.nextInt();
        toplam = sayi1 + sayi2;
        carp = sayi1 * sayi2;
        bol = sayi1 / sayi2;
        cikar = sayi1 - sayi2;
        if (secim == 1) {
            System.out.println("Toplam=" + toplam);
        } else if (secim == 2) {
            System.out.println("cikarma=" + cikar);
        } else if (secim == 3) {
            System.out.println("bolme=" + bol);
        }else if (secim==4){
            if (sayi1==0||sayi2==0){
                System.out.println("cozum sifir");
            }
        }





        }
    }

