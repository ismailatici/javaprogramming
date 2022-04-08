package Day10_NestedIf;

public class SalaryCalculatorIf {
    public static void main(String[] args) {
        double salary= 75000;
        boolean isMarried=true;
        double taxRate=0;
        if (salary>=13000){
            taxRate=0.35;
        }else if(salary>=10000){
            taxRate=0.30;
        }else if(salary>=80000){
            taxRate=0.25;
        }else {
            taxRate=0.2;
        }
        if (isMarried){
            taxRate-=0.05;
        }
    double salaryafterTax=salary-(salary*taxRate);
        System.out.println("Salary After Tax=" +salaryafterTax);


    }


}
