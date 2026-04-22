import java.util.Scanner;
class UserInput{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = input.nextline();
        System.out.println("Good morning"+ name);
        
    }
}