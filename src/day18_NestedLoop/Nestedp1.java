package day18_NestedLoop;

import java.util.Scanner;

public class Nestedp1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.err.println("Invalid entry, Please re enter your age");
                age = scan.nextInt();
            }

            System.out.println("would you like to continue?");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes ") || a.equals("no"))) {
                System.out.println("Invalid Entry,Please re enter.Would you like to continue");
                a = scan.next().toLowerCase();
            }


            if (a.equals("no")) {
                break;
            }
            scan.close();


        }
    }
}
