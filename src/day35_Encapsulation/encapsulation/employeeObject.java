package day35_Encapsulation.encapsulation;

public class employeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("Ali",'M',23,2300);
        employee1.setAge(32);
        Employee employee2=new Employee("ayse",'F',23,14000);
        employee2.setSalary(employee2.getSalary()+150);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
