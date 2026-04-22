import java.util.Scanner;
class AreaofCircle {
    public static void main (String args[]){
        Scanner ar = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        Float r = ar.nextFloat();
        System.out.println("the area is: "+3.14 * r * r); 
    }
}