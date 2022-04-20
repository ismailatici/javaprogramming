package TurkceOop1;

public class EmpDriver {
    public static void main(String[] args) {
        Emplooye m1=new Emplooye("ali",2300,56,2004);
        System.out.println(m1);
        System.out.println("m1 in incrase="  +m1.incrase());
        System.out.println("m1 in taxi="+m1.tax());
        System.out.println( "m1 bonusu=" +m1.bonus());
        System.out.println("m1 in tatal maasi="+(m1.salary+ m1.bonus()-m1.tax()));
        System.out.println(m1.toString());
        System.out.println(m1.totalsalary);
    }
}
