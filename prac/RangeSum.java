import java.util.Scanner;
class RangeSum{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = m; i <= n; i++ )
        {
            sum = sum + i;
        }
        System.out.println(+sum);
    }
}