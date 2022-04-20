package day41_Exceptions;

import day33_Statics.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        System.out.println(a/b);
        System.out.println("Wooden Spoon");

        char[] characters={'A','B','C'};
        System.out.println(characters[99]);
        Student student=null;
        System.out.println(student.getClass());

        final String str="Wooden Spoon";
        //str=null;
        System.out.println(str.toUpperCase());

        String str2="";
        System.out.println(str2.isEmpty());

        System.out.println("hello");
        //Thread.sleep(3000);
        System.out.println("cydeo");

        //FileInputStream file=new FileInputStream("path of the file");


    }
}
