package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Ali");
        Employee employee2=new Employee("ayse",'F');
        Employee employee3=new Employee("ayse",'F',"dr",40.5);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
