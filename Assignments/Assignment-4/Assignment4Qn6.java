class AreaCalculator {

    double calculateArea(double side){
        return side * side;
    }

    double calculateArea(double length, double width){
        return length * width;
    }

    double calculateArea(float radius){
        return 3.14 * radius * radius;
    }
}

public class Assignment4Qn6 {
    public static void main(String[] args){
        AreaCalculator a = new AreaCalculator();

        System.out.println("Area of Square: " + a.calculateArea(5));
        System.out.println("Area of Rectangle: " + a.calculateArea(4,6));
        System.out.println("Area of Circle: " + a.calculateArea(3.5f));
    }
}