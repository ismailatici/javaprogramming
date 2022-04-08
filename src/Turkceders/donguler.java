package Turkceders;

public class donguler {
    public static void main(String[] args) {
       /* int i=1;
        while (i<=5){
            System.out.println(i+",");
            i++;
        }
        System.out.println("");
    }

        */

        for (int i = 1; i <= 5; i++) {
            for (int k =1;k<=5;k++){
                if (k==4){
                    System.out.println("atladi 4");
                    continue;
                }
                System.out.println("i="+i+"k="+k);
            }

        }
    }
}
