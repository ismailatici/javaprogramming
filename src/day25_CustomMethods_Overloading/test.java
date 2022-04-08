package day25_CustomMethods_Overloading;

import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
        String str ="Ismail hadi dayan";
        StringUtility.printEachChar(str);

        String s1 ="Woodon Spoon";
        String reverse=StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("============================");
        String word="Java";
        boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

    }

    








}
