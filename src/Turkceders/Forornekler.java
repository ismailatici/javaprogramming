package Turkceders;

import java.util.Scanner;

public class Forornekler {
    public static void main(String[] args) {
       /* for(int i=1;i<=5;i++) {
            for (int k = 1; k <= 5; k++) {
                System.out.println("i=" + i + "k=" + k);

            }

        }

        */
// break donguyu durdurur
        //continue donguyu durdurmaz ama bir sonraki adima gider
       /* Scanner scan= new Scanner(System.in);
        int sayi;
        while (true){
            System.out.println("sayi giriniz");
            sayi=scan.nextInt();
            if (sayi==0){
                System.out.println("dongu bitti");
                break;
            }
            System.out.println(sayi);
        }


    }

        */
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.println(i);

            }
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayilari giriniz");

        // int sonuc=1;
        //for (int i=scan.nextInt();i>0;i--){
        //    sonuc*=i;
        //}
        //System.out.println(sonuc);


        int t=scan.nextInt();
        for (int i =1; t>=i;i++){
            for (int k=1;k<=i;k++){
                System.out.print("*");

            }
            System.out.println();

        }

    }
}

