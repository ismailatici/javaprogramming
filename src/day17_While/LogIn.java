package day17_While;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        int attempt =3;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your user name");
        String u =scan.next();
        System.out.println("Enter your password");
        String p =scan.next();
        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else {
            int attemps =3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attemps>0){
                System.out.println("Incorrect username or password, please re enter");
                System.out.println("Enter yor username:");
                u =scan.next();

                System.out.println("Enter your password");
                p =scan.next();
                attemps--;
            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("Loggeed in");
            }else {
                System.out.println("Your account is locked.");
            }
        }











    }

}
