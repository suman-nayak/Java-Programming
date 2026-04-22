abstract class Shape {
    int s1, s2;

    Shape(String n) {
        System.out.println("Creating object of: " + n);
    }

    abstract void setData(int x, int y);
    abstract double calculateArea();
}

class Rectangle extends Shape {
    Rectangle() {
        super("Rectangle");
    }

    void setData(int x, int y) {
        s1 = x;
        s2 = y;
    }

    double calculateArea() {
        return s1 * s2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super("Triangle");
    }

    void setData(int x, int y) {
        s1 = x;
        s2 = y;
    }

    double calculateArea() {
        return 0.5 * s1 * s2;
    }
}

public class Assignment5Q6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setData(10, 20);
        System.out.println("Area: " + r.calculateArea());

        System.out.println();

        Triangle t = new Triangle();
        t.setData(10, 20);
        System.out.println("Area: " + t.calculateArea());
    }
}