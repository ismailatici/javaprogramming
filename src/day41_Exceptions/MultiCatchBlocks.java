package day41_Exceptions;
import TurkceOop1.Emplooye;
import day39_Recap.cydeoTask.Employee;
public class MultiCatchBlocks {
    public static void main(String[] args) {
        Emplooye emplooye=null;
        try {
            System.out.println(emplooye.getSalary());

        }catch (NullPointerException e){
            System.out.println("First catch block");
            e.printStackTrace();

        }catch (IndexOutOfBoundsException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Third catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Forth catch block");
            e.printStackTrace();
        }
        System.out.println("Tested Completed");

        try {
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }









    }
}
