package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate=50,
                weeklyHours=45;
        double stateTaxRate=6.5,
                federalTaxRate =26.2;
        int salareyBeforeTax= hourlyRate*weeklyHours*52;
        double stateTax=salareyBeforeTax*stateTaxRate/100;
        double federalTax= salareyBeforeTax*federalTaxRate/100;
        double totalTax=stateTax+federalTax;
        double salaryafterTax=salareyBeforeTax-totalTax;

        System.out.println(" Gross pay is: $"+salareyBeforeTax);
        System.out.println("State tax = $"+stateTax);
        System.out.println("Federal tax= $"+federalTax);
        System.out.println("Net income = $ "+salaryafterTax);





    }
}
