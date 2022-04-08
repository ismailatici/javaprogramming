package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName="iso";
        String lastName ="King";
        int age =45 ;
        String JobTitle ="SDET";
        String CompanyName ="Apple Inc";
        double salary = 10000.58;

        String fullName= firstName+ " " + lastName;
        System.out.println("age = " + age);
        System.out.println("LastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("fullName of the Person is = " + fullName);
        // ---is   years old

        System.out.println( fullName + " is " + JobTitle +", works at " + CompanyName +", and" + fullName +"'s salary is $ " +salary );







    }




}
