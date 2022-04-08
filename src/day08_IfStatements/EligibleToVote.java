package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name ="iso";
        int age =38;
        String citizen ="TR";
        boolean isEligible=age>=21&&citizen=="TR";
        if (isEligible){
            System.out.println("Eligible");
        }
        if (!isEligible){
            System.out.println("notEligible");
        }

    }
}
