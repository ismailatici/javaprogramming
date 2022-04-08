package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender= input.nextLine();
        input.nextLine();
        System.out.println("enter your fullName");
        String fullName =input.nextLine();
        System.out.println("Enter your  Phone number");
        long Phone =input.nextLong();
        System.out.println("Enter your zip code");
        int zipCode =input.nextInt();
        input.nextLine();
        System.out.println("School name");
        String schoolName =input.nextLine();
        System.out.println("Enter your City name");
        String city =input.nextLine();
        System.out.println("Enter your state name");
        String state =input.nextLine();
        System.out.println("enter your Buildig number");
        String buildingnumber =input.nextLine();
        input.close();
        System.out.println("Full name: " +fullName);
        System.out.println("Age : "+age);
        System.out.println("Phone number "+Phone);
        System.out.println("gender: "+gender);
        System.out.println("Address: \n\t"+buildingnumber+" "+"\n\t"+city+","+state+" "+zipCode);
        System.out.println("School name "+schoolName);



























    }
}
