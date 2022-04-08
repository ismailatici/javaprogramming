package Day10_NestedIf;

public class NestedIf2 {
    public static void main(String[] args) {
        int n= 2;
        String name= (n==1)? "pzt" :(n==2)? "sali":(n==3)? "crs":(n==4)? "prs":"cuma";
        System.out.println(name);

        System.out.println("----------------------");
        int s =45;
        String result =(s>=0 && s<=100)? (s>=90)? "Excellent" :(s>=80)?"idare eder":(s>=60)?"Passed":"Failed" : "Invalid";
        System.out.println(result);

        System.out.println("-------------------------------------");
        char ch = 65;
        if (ch>=48 && ch<=57){
            System.out.println("Digit");
        }else if ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            System.out.println("alphabetic");
        }else {
            System.out.println("Special character");
        }








    }






}
