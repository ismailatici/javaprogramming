package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        System.out.println(true  ==!false);
        System.out.println(!true==!false);

        int score=85;
        boolean a= score>=90&& score<=100;
        boolean b = score>=80 && score<=89;
        boolean c= score>=70&&score<=79;
       // boolean c =!a && !b && score<=79;
        boolean d = score>=60 && score<=69;
        if (a){
            System.out.println("Exellent");
        }
        if (b){
            System.out.println("Great");

        }
        if (c){
            System.out.println("Good");
        }














    }
}
