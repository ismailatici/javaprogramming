package day23_CustomMethodsIntro;

public class CustomMethodsParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        ageOf(1990);

    }
    public static void oddOrEven(int number){
        if (number %2 ==0){
            System.out.println("even is number" + number);
        }else{
            System.out.println("is odd number = " + number);
        }

    }
    public static void ageOf(int birthYear){
        int age=2021-birthYear;
        System.out.println("Your age is = " + age);
    }
}
