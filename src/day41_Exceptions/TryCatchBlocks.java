package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("test started");
        try {
            System.out.println(9/0);
            System.out.println("Try block");

        }catch (ArithmeticException e){
            System.out.println("Catch Block");
            System.out.println("Aritmetic Exception was occrred");

        }
        System.out.println("Test1 Completed");


        System.out.println("Test 2 Started");

        int[]numbers={1,2,3,4,5};
        try {System.out.println(numbers[200]);
            System.out.println("Try Block");

        }catch (RuntimeException e){
            System.out.println("Catch Blok");
            System.out.println("Run time exception was occurred");
        }

        System.out.println("=================================");

        try {
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        try {
            Thread.sleep(3000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("hello");

        try {
            FileInputStream file=new FileInputStream("File path");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }




    }
}
