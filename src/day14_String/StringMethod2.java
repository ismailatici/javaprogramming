package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str ="Java is fun , I love learning Java";
        String str2 =str.replace("Java", "Pyhton");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        String email ="ismailatici@gmail.com";
        email.replace("gmail","gmail");
        System.out.println("email = " + email);
        String sentece = "Java Java Phyton Phyton C# C# C++ C++ Phyton Phyton Phyton ";
        String sentece2= sentece.replace("Phyton","");
        System.out.println("sentece2 = " + sentece2);

        String s ="Dog Dog Dog Dog Dog";
        s =s.replace("Dog","Cat");//"Cat..
        System.out.println("s = " + s);

        String s2 ="C# is fun, C# is cool";
        s2=s2.replace(" C#","Java");
        System.out.println("s2 = " + s2);

        String s3="Java";
        s3=s3.replace("a","e");
        System.out.println("s3 = " + s3);// Jeve........

        System.out.println("-----------------");

        String result = "Java Java Java ";
        result=result.replaceFirst("Java","Phyton");
        System.out.println(result);

        String result3= "JAVA";
        result3=result3.replaceFirst("A","o");
        System.out.println(result3);












    }



}
