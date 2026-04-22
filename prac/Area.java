import java.util.Scanner;
class Area {
    public static void main (String args[]){
    Scanner ar = new Scanner(System.in);
    System.out.print("Enter the lenth of rectangle: ");
    int len = ar.nextInt();
    System.out.print("Enter the Breath of rectangle: ");
    int br = ar.nextInt();

    System.out.println("The area is: "+(2*(len*br)));
}
}