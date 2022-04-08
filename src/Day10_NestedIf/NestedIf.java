package Day10_NestedIf;

public class NestedIf {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("Failed");
            }


        } else {
            System.out.println("Invalid score");
        }

        System.out.println("---------------------------");
        int age = 21;
        boolean hasIde = true;
        if (hasIde) {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to by alcohol");
            }
        }
    }
}








