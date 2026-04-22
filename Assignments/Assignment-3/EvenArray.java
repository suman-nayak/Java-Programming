import java.util.Scanner;
class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int[] num = new int[size];
        System.out.println("Enter "+size+" Elements:");
        for(int i = 0; i < size; i++)
        {
            num[i] = sc.nextInt();
        }
        System.out.print("The Even Array Elements are:");
        for(int i = 0; i < size; i++)
        {
            if (num[i] % 2 == 0) {
                System.out.print(num[i]+"\t");
            }
        }
        System.out.print("\nThe Odd Elements are:");
        for(int i = 0; i < size; i++)
        {
            if(num[i] % 2 != 0 )
                System.out.print(num[i]+"\t");
        }
    }
}