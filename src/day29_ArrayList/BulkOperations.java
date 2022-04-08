package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,8,910,3,3,3,5,5,55,58,8,8,8,8));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);
        System.out.println("=======================================");

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,100,300,100,700,800,900));
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);
        ArrayList<String>jobTiteles=new ArrayList<>();
        jobTiteles.addAll(Arrays.asList("QA","SDET","DEVELOPER","SDET","Scrum Master","BA","BA"));
        jobTiteles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTiteles);

        System.out.println("==============================");

        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,12,1,2,3,8,9,10));
        boolean r1 =nums.contains(10);
        boolean r2=nums.contains(2) && nums.contains(5) && nums.contains(10);
        boolean r3 =nums.containsAll(Arrays.asList(2,5,10));
        System.out.println("r3 = " + r3);
        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);

        System.out.println(" = _______________________________");

        String[] names={"Josh","Jack","Daniel","Shay","Breanne"};
        ArrayList<String>namesList=new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);

        Integer[] arr={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        int[] arr2={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list3=new ArrayList<>(convertArrayToArrayList(arr2));

    }
    public static ArrayList<Integer>convertArrayToArrayList(int[]array){
        ArrayList<Integer>list=new ArrayList<>();
        for (int each:array) {
            list.add(each);
        }
        return list;
    }
}
