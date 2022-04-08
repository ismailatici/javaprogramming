package Day10_NestedIf;

public class Ternaries {
    public static void main(String[] args) {
        int n=100;
        if (n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
        System.out.println("-------------------");
        String result = (n%2==0)?"Even":"Odd";
        System.out.println(result);

        System.out.println("----------------");
        int number =43;
        String result2 =(number>=0)?"positiv": "Negativ";
        System.out.println(result2);













    }
}
