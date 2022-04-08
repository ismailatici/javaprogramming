package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(2,25);

        System.out.println(numbers);
        System.out.println(numbers.size());
        int lastIndex=numbers.size()-1;
        System.out.println(lastIndex);

        int num=numbers.get(3);
        System.out.println("num = " + num);
        System.out.println("======================================");

        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"C++");
        System.out.println(list);

        System.out.println("=======================");


        ArrayList<String>employees=new ArrayList<>();
        employees.add("ali");
        employees.add("vali");
        employees.add("dali");
        employees.add("sali");
        employees.add("mali");
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        employees.remove("sali");
        System.out.println(employees);





    }
}
