package day33_Statics;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
