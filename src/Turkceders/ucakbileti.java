package Turkceders;

import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int km,yas,tip;
        System.out.println("km yi giriniz");
        km= scan.nextInt();
        System.out.println("yasi giriniz");
        yas=scan.nextInt();
        System.out.println("tipi giriniz (1=tek gidis,2=gidis donus:)");
        tip=scan.nextInt();
        double normalFiyat,yasindirimi,tipIndirimi;
        if (km>0 && yas>0 &&(tip==1 || tip==2)){
            normalFiyat=km*0.10;
            if (yas<12){
                yasindirimi=normalFiyat*0.5;
            }else if (yas>12 && yas<24){
                yasindirimi=normalFiyat*0.1;
            }else if (yas>65){
                yasindirimi=normalFiyat*0.3;
            }else {yasindirimi=0;}
            normalFiyat-=yasindirimi;
            if (tip==2){
                tipIndirimi=(2*normalFiyat)*0.2;
                normalFiyat-=tipIndirimi;

            }
            System.out.println("bilet tutari:"+normalFiyat+"$");

        }else {
            System.out.println("girdiler yanlis lütfen tekrar deneyiniz");
        }

    }
}
