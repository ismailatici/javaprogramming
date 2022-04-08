package day17_While;

public class FrequencyOfWord_Whileloop {
    public static void main(String[] args) {
        String str =" Java Java Python Python";
        int frequency= 0;
        while (str.contains("java")){
            str =str.replaceFirst("Java","");
            frequency++;
        }
        System.out.println(frequency);


        System.out.println("------------------");

        String sentence ="cat cat cat cat cat dog dog dog cat cat";
        int countCat =0;
        while (sentence.contains("cat")){
            sentence =sentence.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(countCat);

        System.out.println("---------------------------");

        String s ="Java Java Java python python";
        int countJava =0;
        int countPhython=0;










    }
}
