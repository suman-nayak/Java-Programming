import java.util.Scanner;
public class Mlo {
    public static void main(String args[]){
        Scanner mt = new Scanner(System.in);

        System.out.println("Enter x:");
        double x = mt.nextDouble();

        System.out.println("Enter y:");
        double y = mt.nextDouble();

        System.out.println("Maximum: "+Math.max(x, y));
        System.out.println("Minimum: "+Math.min(x,y));
        System.out.println("x^y: "+Math.pow(x,y));
        System.out.println("Square root of x: "+Math.sqrt(x));
        System.out.println("Random number (10 - 100):"+(int)(Math.random() * 91 + 10));
    }
}