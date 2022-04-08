package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class test2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);


        double [] arr2={1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);

        char[] arr3={'A','B','C'};
        ArraysUtility.printEachElement(arr3);
        String[] names={"ali","Veli","deli"};
        ArraysUtility.printEachElement(names);

        int[] n1 ={1,2,3,4,5,6};
        int max1 =ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        int[] a1={1,2,3,4,5,6,7};
        boolean r1 =ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);



    }
}
