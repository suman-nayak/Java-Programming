import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("_-=-_-=-_-=-_Wellcome to calculator Menu_-=-_-=-_-=-_");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("0. Exit");

            System.out.print("Enetr your choice: ");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1: Add();
                break;
                case 2: Sub();
                break;
                case 3: Mul();
                break;
                case 4: Div();
                break;
                case 5: Mod();
                break;
                case 0: sc.close();
                break;
                default:
                    System.out.println("Please enter (0 to 5)");
            }
        }
    }
    public static void Add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many Number you want to calculate :");
        int n = sc.nextInt();
        int sum = 0;
        int [] arr = new int[n];
        System.out.println("Enter the Numbers: "+n);
        for(int i = 0; i < n; i++){
            System.out.println("Element-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum is: "+ sum);
    }

    public static void Sub(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to calculate: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sub = arr[0];
        for (int i = 1; i < n; i++) {
            sub -= arr[i];
        }

        System.out.println("Subtraction is: " + sub);
    }

        public static void Mul() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to calculate: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int mul = 1;
        for (int i = 0; i < n; i++) {
            mul *= arr[i];
        }

        System.out.println("Multiplication is: " + mul);
    }

        public static void Div() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to calculate: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No numbers to divide.");
            return;
        }

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element-" + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }

        double div = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == 0) {
                System.out.println("Cannot divide by zero at element " + (i + 1));
            return;
        }
        div /= arr[i];
        }

        System.out.println("Division is: " + div);
    }

    public static void Mod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to calculate: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No numbers for modulo.");
        return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int mod = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == 0) {
                System.out.println("Cannot modulo by zero at element " + (i + 1));
            return;
        }
        mod %= arr[i];
        }

        System.out.println("Modulo is: " + mod);
    }
} 