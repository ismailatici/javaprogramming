package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String FullName =input.nextLine();
        System.out.println("Enter your  Programming language");
        String Programming = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine(); // ********
        System.out.println("Enter your Scholl");
        String Scholl = input.nextLine();
        System.out.println("full name: "+FullName);
        System.out.println("Programming Language: "+Programming);
        System.out.println("Your age: "+age);
        System.out.println("Your Scholl: "+Scholl);
        input.close();//**********+
    }
}
