import java.util.Scanner;
class fact {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any nuber:");
    int n = sc.nextInt();
    int fa = 1;
    for(int i = 1; i <= n; i++)
    {
        fa = fa * i;
    }
    System.out.println("The factroial is:"+ fa);
}
    
}
