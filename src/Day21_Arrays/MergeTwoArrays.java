package Day21_Arrays;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] group1={"Ali","Layan","Ayse"};
        String[] group2={"Alican","Layla","Aysegul","cosku"};
        String[] students=new String[group1.length+group2.length];
        int i=0;
        for (String each:group1){
            students [i++]= each;
        }
        for (String each:group2){
            students [i++]= each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("---------------------");
        char [] ch1={'A','B','C'};
        char[] ch2={'D','E','F'};
        char[] chars=new char[ch1.length+ ch2.length];
        int j=0;
        for (char ch :ch1){
            chars[j]=ch;
            j++;
        }
        for (char ch:ch2){
            chars[j]=ch;
            j++;
        }
        System.out.println(Arrays.toString(chars));











    }
}
