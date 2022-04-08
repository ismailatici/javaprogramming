package Day22_MultiDimensional;

import java.util.Arrays;

public class ReverseSentece {
    public static void main(String[] args) {
        String sentece="today a good day to learn Java";
        String[] words=sentece.split(" ");
        System.out.println(Arrays.toString(words));
        String reversedSentence="";
        for (int i= words.length-1;i>=0;i--){
            reversedSentence +=words[i]+" ";
        }
        System.out.println(reversedSentence);









    }
}
