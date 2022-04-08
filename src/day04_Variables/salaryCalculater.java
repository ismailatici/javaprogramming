package day04_Variables;

public class salaryCalculater {
    public static void main(String[] args) {
        // hourlyRate, WeeklyHours
        int hourslyRate = 50 ;
        int weeklyHours =45 ;
        int numberOfWeeks = 52;
        int salary = hourslyRate * weeklyHours * numberOfWeeks;
                System.out.println("hourlyRate = $" + hourslyRate);
        System.out.println("weeklyHous = " + weeklyHours);
        System.out.println("numberOfWeek=" + numberOfWeeks);
        System.out.println("salary= $" + salary);

    }


}
