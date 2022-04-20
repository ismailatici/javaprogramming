package TurkceOop1;

public class Student {
    public String name;
    public int id,puan;
    private static int counter;

    public Student(String name, int id,int puan) {
        this.name = name;
        this.id = id;
        this.puan= puan;
        Student.counter++;
    }
    public void exit(){
        Student.counter--;
    }
    public static int howStudent(){
        return Student.counter;
    }
    public static double calcOverall(int[] arr){
        double overal=0;
        for (int i=0;i<arr.length;i++){
            overal+=arr[i];
        }
        return overal/arr.length;
    }
}
