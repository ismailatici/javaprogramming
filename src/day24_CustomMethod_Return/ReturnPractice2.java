package day24_CustomMethod_Return;

public class ReturnPractice2 {
    public static void main(String[] args) {
        String str1=grade(95);
        if (str1.equals("A")){
            System.out.println("Excellent");
        }else if (str1.equals("B")){
            System.out.println("Great");
        }else if (str1.equals("C")){
            System.out.println("Good");
        }else if (str1.equals("D")){
            System.out.println("Passed");
        }else {
            System.out.println("Try again1");
        }

    }
    public static String grade(int score){
        String result="";
        if (score<0|| score>100){
            result="Invalid";
        }else {
            result=(score>=90)?"A":(score>=80)?"A":(score>=70)?"A":(score>=60)?"A":"F";
        }
        return result;
    }
}
