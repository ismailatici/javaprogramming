package day31_Constructors;

public class Rectangle {
    public double length,witdh;

    public Rectangle(double length, double witdh) {
        this.length = length;
        this.witdh = witdh;
    }
    public double calcArea(){
        return length*witdh;
    }
    public double calcPerimetrer(){
        return 2 *(length+witdh);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", witdh=" + witdh +
                ",perimeter="+calcPerimetrer()+
                '}';
    }
}
