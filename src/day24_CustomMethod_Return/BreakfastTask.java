package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTask {
    public static void main(String[] args) {
        initials("Wooden","Spoon");

        domain("Cydeo.School@amazon.com");
        System.out.println(" ========================= ");
        String[]emails={"atici@gmail.com","ali@yahoo.com","Ela@cydeo.com"};
        for (String email:emails){
            domain(email);
        }
       nameOfMonth((10));
    }
    public static void initials(String firstname,String lastname){
        String initial=firstname.charAt(0) +"."+lastname.charAt(0);
        initial=initial.toLowerCase();
        System.out.println("initial="+initial);
    }
    public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
    public static void nameOfMonth(int number){
        String name="";
        if (number>=1&& number<=12){
            name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Feb":(number==4)?"Feb":(number==5)?"Feb":(number==6)?"Feb":
                    (number==7)?"Feb":(number==8)?"Feb":(number==9)?"Feb":(number==10)?"Ekim":(number==11)?"Feb"
                            :(number==12)?"Feb":"Invalid";
            System.out.println("name = " + name);
        }


    }






}
