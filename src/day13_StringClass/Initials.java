package day13_StringClass;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName =input.nextLine();
        System.out.println("Enter your last name");
        String lastName =input.nextLine();
        char f =firstName.charAt(0);
        char l = lastName.charAt(0);
        String initial = f+"."+l;
        System.out.println("initial:"+initial);
        input.close();


    }
}
