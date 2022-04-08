package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number betwen 1 to 7:");
        int num =input.nextInt();
        String result ="";
        if (num >=1 && num <=7){
            result=(num==1)? "Monday":(num==2)? "Monday":(num==3)? "Monday":(num==4)? "Wed":(num==5)? "Thu":
                    (num==6)? "Fri":"sunday";

        }else {
            result="Invalid Number";
        }
        System.out.println(result);
        input.close();







    }
}
