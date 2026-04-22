import java.util.Scanner;
public class MultiT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the multiplication table number:");
        int num = sc.nextInt();
        Multiplication(num);
    }
    
    public static void Multiplication(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num+"X"+i+"="+num*i);
        }
    }
}
