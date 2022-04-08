package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 300;
        boolean evenNumber=number%2==2;
        boolean oddNumber=!evenNumber;
        if (evenNumber){
            System.out.println("is even Number = " + number);
        }
        if (oddNumber){
            System.out.println(number+" is odd number");
        }
        System.out.println("Odd Number");
        System.out.println("even Number");
        
    }
}
