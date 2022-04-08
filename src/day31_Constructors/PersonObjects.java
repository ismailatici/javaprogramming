package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {
    Person person1    =new  Person("Daniel",'M',32);
    Person person2 =new Person("zeki",'M',31);

        System.out.println(person2);
    System.out.println(person1);
    person2.age=30;
    }
}
