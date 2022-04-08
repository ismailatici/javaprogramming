package day18_NestedLoop;

public class DivideTwoNumber {
    public static void main(String[] args) {
        int a =30, b=7,count=0;
        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+" with a remander of "+a);

    }
}
