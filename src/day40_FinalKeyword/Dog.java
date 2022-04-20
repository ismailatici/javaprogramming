package day40_FinalKeyword;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    public void eat(){
        System.out.println(getName()+"is eat dog food");
    }
    /*public void drink(){
        System.out.println(getName()+"is drink beer");
    }

     */
    public void bark(){
        System.out.println(getName()+"is barking");
    }
}
