package day13_StringClass;

import java.util.Locale;

public class StringsMethods {
    public static void main(String[] args) {
        String word ="Cydeo";
        char thirdChar =word.charAt(2);
        System.out.println("thirdChar= "+thirdChar);
        System.out.println("----------------------");

        String s1 = "Batch 25 is the best batch";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);
        char lastChar =s1.charAt(s1.length()-4);
        System.out.println("lastChar = " + lastChar);
        System.out.println("----------------------" );

        String str ="Wooden Spoon";
        str =str.toUpperCase();
        System.out.println(str);

        String s = "JAVA";
        s =s.toLowerCase();
        System.out.println( s);




    }
}
