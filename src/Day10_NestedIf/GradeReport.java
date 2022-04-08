package Day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 222;
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("super");
            } else if (score >= 80) {
                System.out.println("iyi");
            } else if (score >= 70) {
                System.out.println("orta");
            } else if (score >= 60) {
                System.out.println("ehh");
            } else if (score <= 45) {
                System.out.println("faild");
            }
        } else {
            System.out.println("invalid score");
        }










    }
}




      /*
       int day =9;
        if (day>=1 && day<=7) {
            if (day == 1) {
                System.out.println("pazartesi");
            } else if (day == 2) {
                System.out.println("sali");
            } else if (day == 3) {
                System.out.println("carsamba");
            } else if (day == 4) {
                System.out.println("persembe");
            } else if (day == 5) {
                System.out.println("cuma");
            } else if (day == 6) {
                System.out.println("cumartesi");
            } else if (day == 7) {
                System.out.println("pazar");
            }
        }else {
                System.out.println("yanlis sayi");
            }
       */




