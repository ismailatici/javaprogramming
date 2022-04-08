package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] myGroup=new String[3];
        myGroup[0]="Gunay";
        myGroup[1]="ismail";
        myGroup[2]="eren";
        //System.out.println(myGroup);
        System.out.println(Arrays.toString(myGroup));//null null ...
        System.out.println("-----------------------------------------");

        String[]days={"monday","tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //index:         0         1         2          3         4        5         6
        // days[7]="java days"
        System.out.println(Arrays.toString(days));
        int number =5;
        if ((number < 1) || (number>7)){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);












    }
}
