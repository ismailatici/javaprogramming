package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name="ismail";
        int age=19;
        String citizen="USA ";
        boolean isEligible= age>=18 && citizen=="USA";
        System.out.println(name+" is eligible to vote:" +isEligible);
        System.out.println("----------------------------------------------------");

        String name2="eren";
        int creditScore=800,
                age2=24,
                income=4000;
        char gender='F';
        boolean isEligible2= creditScore>=500&&age2>=21&&income>=80000 && (gender=='M'|| gender=='F');
        System.out.println(name2+" is eligible for loan: "+isEligible2);

        boolean result3=true,
                result2 =!result3;
        System.out.println("result3 = " + result3);
        System.out.println("result2 = " + result2);





    }
}
