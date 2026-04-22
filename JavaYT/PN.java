import java.util.Scanner;
class PN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any +ve and -ve Number:");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num+" is Positive number");
        }
        else if (num < 0){
            System.out.println(num+" is Negative Number");
        }
        else{
            System.out.println(num+"  is ZERO");
        }
    }
}
