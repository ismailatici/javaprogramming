package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setInfo("max","husky",'M',2,"small","mavi");
       dog.eat();
       dog.drink();
       dog.sleep();
       dog.move();
       dog.bark();
        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("sese","kurt",'M',23,"large","kirmizi");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();
        System.out.println(cat);

    }
}
