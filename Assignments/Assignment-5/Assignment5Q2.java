import java.util.Scanner;

class Rectangle {
    int len;
    int bre;

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rectangle Length: ");
        len = sc.nextInt();
        System.out.print("Enter Rectangle Breadth: ");
        bre = sc.nextInt();
    }

    int area() {
        return len * bre;
    }
}

class Square extends Rectangle {

    int len;

    @Override
    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Square Length: ");
        len = sc.nextInt();
    }

    @Override
    int area() {
        return len * len;
    }
}

public class Assignment5Q2 {
    public static void main(String[] args) {
         
        System.out.println("--- Rectangle Details ---");
        Rectangle rect = new Rectangle();
        rect.inputData();
        System.out.println("Area of Rectangle: " + rect.area());

        System.out.println();
 
        System.out.println("--- Square Details ---");
        Square sq = new Square();
        sq.inputData();
        System.out.println("Area of Square: " + sq.area());
    }
}