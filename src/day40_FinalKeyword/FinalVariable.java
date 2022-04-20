package day40_FinalKeyword;

public class FinalVariable {
    final String bithday;

    public FinalVariable(String bithday) {
        this.bithday = bithday;
    }

    public static void main(String[] args) {
        final double pi=3.14;

        final String name ;
        name="java";
        //name="wooden ";
        System.out.println(name);

        FinalVariable obj=new FinalVariable("may01");
        System.out.println(obj.bithday);




    }
}
