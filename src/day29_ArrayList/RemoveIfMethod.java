package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /*for (int i = 0; i < list.size(); i++) {
            if (list)
           }

         */
        System.out.println(list);

        list.removeIf(p-> p<5);//lambda Expression
        System.out.println(list);


        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each-> each%2==0);
        System.out.println(list2);

        ArrayList<String>list3=new ArrayList<>();
        list3.addAll(Arrays.asList("Java","C#","Javas","C++","Javax"));
        list3.removeIf(p-> p.startsWith("J"));
        System.out.println(list3);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf( name -> !StringUtility.isPalindrome(name));

        System.out.println(names);







    }
}
