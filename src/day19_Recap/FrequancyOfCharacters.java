package day19_Recap;

public class FrequancyOfCharacters {
    public static void main(String[] args) {
        String str ="aabcccd",
                result="";//a2b1c3d1
        for (int j =0;j<str.length();j++) {
            char ch = str.charAt(j);//each character from string
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" +ch)){
                continue;
            }
            result +=ch;
            result +=count;
        }
        System.out.println(result);









    }
}
