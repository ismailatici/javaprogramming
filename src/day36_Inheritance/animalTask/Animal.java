package day36_Inheritance.animalTask;

public class Animal {
    public String name, bread;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String bread, char gender, int age, String size, String color) {
        this.name = name;
        this.bread = bread;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }
    public void eat(){
        System.out.println("is eating= " + name);
    }
    public void drink(){
        System.out.println("is eating= " + name);
    }
    public void move(){
        System.out.println("is driking= " + name);
    }
    public void sleep(){
        System.out.println("is sleeping= " + name);
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
