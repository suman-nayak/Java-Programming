import java.util.Scanner;
class Seri{
    int fact(int n){
        int f = 1;
        if(n == 0)
            return 1;
        else
        {
            for(int i = 1; i <= n; i++)
            {
                f = f * i;
            }
            return f;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Seri k = new Seri();
        double sum = 0.0;
        System.out.println("Enter the value of x:");
        int x=sc.nextInt();

        System.out.println("enter the value of N:");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            sum = sum+Math.pow(x,i)/k.fact(i);
        }
        System.out.println("Sum of nth term is:"+sum);
    }
}