package Turkceders;

public class turkceDers {
    public static void main(String[] args) {
        int a=10,
                b=5,toplam=a+b,cikarma=a-b,carpma=a*b,bolme=a/b;
        /*System.out.println("Toplam:" +toplam);
        System.out.println("cikarma:" +cikarma);
        System.out.println("carpma:" +carpma);
        System.out.println("bolme:" +bolme);

         */
        toplam++;
        cikarma--;
        int sonuc =++a+--b;
        System.out.println(a);
        System.out.println(b);
        int sayi1=10,
                sayi2=5;
        boolean kosul=(sayi1/sayi2)==2;
        System.out.println(kosul);
        boolean kosul1=(sayi1>sayi2);
        boolean kosul2=(sayi1<sayi2);
        boolean sonuc2=kosul1&&kosul2;
        String sonuc3=(a==b)?"dogru":"yanlis";
        System.out.println(sonuc3);

    }
}
