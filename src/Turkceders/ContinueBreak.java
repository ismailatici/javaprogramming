package Turkceders;

import java.util.Scanner;

public class ContinueBreak {
    public static void main(String[] args) {
       /* while (true){
            System.out.println("merhabalar");
            break;
        }


        Scanner scan =new Scanner(System.in);
        int sayi;
        while (true){
            System.out.println("bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi==0){
                System.out.println("dongu bitti");
                break;
            }
            System.out.println(sayi);
        }

        */
        for (int i =1; i<=10 ;i++){
            if (i==4||i==9){
                System.out.println("atladi "+i);
                continue;
            }
            System.out.println(i);
        }














    }

}
