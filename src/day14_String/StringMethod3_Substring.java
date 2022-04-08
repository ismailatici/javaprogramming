package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring(beginning index, eding index)
        String word="Cydeo School";
        //String brand
        String brand =word.substring(0,4+1);
        System.out.println(brand);
        String str1 =word.substring(6);
        System.out.println(str1);

        //String word2 ="Java Programming Language";
        //String s1=word2.substring(0,word2.indexOf(" "));


        //System.out.println(s1);

        String word3 ="Phyton C# Ruby";
        String s2=word3.substring(0,word3.indexOf(" "));
        String s3=word3.substring(word3.indexOf(" ")+1,word3.lastIndexOf(" "));
        String s4=word3.substring(word3.lastIndexOf(" ")+1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);












    }
}
