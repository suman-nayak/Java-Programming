import java.util.Scanner;
class Cal {
    public static void main(String args[]){
        Scanner cl = new Scanner(System.in);

        System.out.print("Enter first number:");
        double a = cl.nextDouble();

        System.out.print("Enter Second number:");
        double b = cl.nextDouble();

        System.out.print("Enter Operator (+, -, *, /):");
        char op = cl.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Result:"+(a + b));
                break;
            case '-':
                System.out.println("Result:"+(a - b));
                break;
            case '*':
                System.out.println("Result:"+(a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result:"+(a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}