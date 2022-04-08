package day14_String;

public class StringMetods1 {
    public static void main(String[] args) {
        String str1 = "     batch 25     ";
        str1.trim();//"batch 25"
        System.out.println(str1);
        String str2 ="Cydeo school";
        int n1 =str2.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2 =str2.indexOf("o");
        System.out.println("n2 = " + n2);


        System.out.println("--------------------------");
        String s = "Java Nova Cava Wawa  orange";
        int firstA=s.indexOf("a");
        int lastA =s.lastIndexOf("a");
        int secondA =s.indexOf("a ");
        int thirdA =s.indexOf("a C");
        //int fourthA =s.lastIndexOf("av");
        int fourthA=s.lastIndexOf("Ca")+1;
        int fifthA =s.lastIndexOf("a W");
        int sixthA=s.lastIndexOf("aw");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);









    }
}
