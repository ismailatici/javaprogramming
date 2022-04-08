package Turkceders;

import java.util.Scanner;

public class Array1 {
    public static void mean(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
        }
        System.out.println("ortalama="+total/arr.length);
    }
    public static void main(String[] args) {
        int [] arr1={10,20,30,40,50};
        int [] arr2=new int[5];
        /*for (int i = 0; i < arr1.length; i++) {
            System.out.println("Arrayler:"+arr1[i]); }*/

        System.out.println("degerleri giriniz");
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= scan.nextInt();
        }
        /*System.out.println("Arrayler yaziliyor");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("eleman"+arr2[i]);
        }

         */
        mean(arr2);






    }
}
