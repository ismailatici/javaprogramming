package TurkceOop1;

public class MainStudent {
    public static void main(String[] args) {
        Student student1=new Student("ali",2345,90);
        Student student2=new Student("yasemin",321,80);
        Student student3=new Student("emin",1097,70);

        System.out.println("online ögrenci:"+Student.howStudent());
        student1.exit();
        System.out.println("online ogrenci"+Student.howStudent());
        int[]notlar=new int[3];
        notlar[0]= student1.puan;
        notlar[1]= student2.puan;
        notlar[2]= student3.puan;
        System.out.println(Student.calcOverall(notlar));
        System.out.println();

    }
}
