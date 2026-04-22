import java.util.Scanner;
class Greet {
    public void greet(String name) {
        System.out.println("Hello "+name+"! Welcome to java programming.");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        Greet g = new Greet();
        g.greet(name);
    }
}