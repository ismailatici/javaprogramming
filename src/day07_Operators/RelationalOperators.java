package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean result1= 20>40;
        System.out.println("result1 = " + result1);
        boolean result2 =300>=150;
        System.out.println("result2 = " + result2);
        boolean result3 =100>=100;
        System.out.println("result3 = " + result3);
        boolean result4 =300>=500;
        System.out.println("result4 = " + result4);
        int score =745;
        boolean isEligibleForLoan= score>=720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        int sscore=59;
        boolean hasFailed= sscore<=59;
        System.out.println("hasFailed = " + hasFailed);
        int x =100;
        int y = 200;
        boolean equel = x==y;
        // 100=200
        System.out.println("equel = " + equel);
        boolean result9 ="A"=="a";
        System.out.println("result9 = " + result9);

        boolean result10= 100!=200;
        System.out.println("result10 = " + result10);
        boolean result12 = "JAva"!="java";
        System.out.println("result12 = " + result12);








    }
}
