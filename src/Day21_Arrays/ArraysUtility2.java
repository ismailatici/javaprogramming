package Day21_Arrays;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students ={"Gunay","Anna","Zuhal","Ahmet","Maria","Sinema"};
        String[] earlyBirds = Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));

        char[] ch1={'a','c','b','c','d','e','f'};
        char[] ch2=Arrays.copyOfRange(ch1,2,5+1);
        System.out.println(Arrays.toString(ch2));

        int[] scores={10,20,30,40,50,60,70,80,90,100};
        //             0  1  2  3  4  5  6  7  8
        int[] result =Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));

        int[] result2=Arrays.copyOfRange(scores,3,scores.length);
        System.out.println(Arrays.toString(result2));











    }
}
