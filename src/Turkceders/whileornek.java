package Turkceders;

import java.util.Scanner;

public class whileornek {
    public static void main(String[] args) {
        /*int i =1;
        while (i<=10){
            i++;
            if (i%2==0){
                System.out.println(i);
            }
        }

        Scanner scan =new Scanner(System.in);
        int input;
        int toplam=0;

        while (true){
            System.out.println("lutfen sayi gir");
            input= scan.nextInt();
            if (input<0){
                System.out.println("negatif sayi bitti");
                break;
            }
            if (input%2==0){
                toplam+=input;
            }
        }
        System.out.println("teksayilar toplami: "+toplam);
        */
        Scanner scan= new Scanner(System.in);
        System.out.println("sayi gir");
        int i= scan.nextInt();
        int k =1;
        while (k<=i){
            k=k*2;
            System.out.println(k);
        }


    }
}
