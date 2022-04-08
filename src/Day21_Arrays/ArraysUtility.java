package Day21_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        System.out.println( nums);
        System.out.println(Arrays.toString(nums));
        /*String str ="Java";
        /*System.out.println(str);
        System.out.println(str.toString());


         */
        System.out.println("------------------");
        int[] scores ={95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);//55...100
        System.out.println(Arrays.toString(scores));
        System.out.println("min scores = " + scores[0]);
        System.out.println("max scores = " + scores[scores.length-1]);

        String[] names={"gunay","Anna","Zuhal","Ahmet","Maria","Sinema"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("-----------------");
        int [] arr2={1,2,3},
                arr1={1,2,3};
        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);//123
        Arrays.sort(arr2);//123
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("---------------");

        char[] ch1={'a','c','b'},
                ch2={'a','b','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println("anagram =" +anagram);









    }
}
