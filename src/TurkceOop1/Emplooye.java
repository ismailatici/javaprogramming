package TurkceOop1;

public class Emplooye {
    private String name;
    public double salary;
    private int workHour;
    private int year;
    public double totalsalary=salary+bonus()-tax();





    public Emplooye(String name, double salary, int workHour, int year) {
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.year = year;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }

    public double bonus() {
        double extraHour = (this.workHour - 40);
        if (extraHour > 0) {
            return 30 * extraHour;
        }
        return 0.0;
    }

    public double incrase() {
        int year = 2020 - this.year;
        if (year < 10) {
            return (salary * 0.05);
        } else if (year >= 10 && year < 20) {
            return (salary * 0.1);
        } else {
            return salary * 0.15;
        }
    }


    public String toString() {
        return "Emplooye{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHour=" + workHour +
                ", year=" + year +
                '}';
    }

    public double getSalary() {
        return 0;
    }
}
