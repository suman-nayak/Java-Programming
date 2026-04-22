import java.util.Scanner;
class Prime {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of X:");
        int x = sc.nextInt();

        System.out.println("The value of Y is: ");
        int y = sc.nextInt();

        for(int i = x; i <= y; i++){
            if (i < 2) {
                continue;
            }
            int c = 0;
            for(int k=1; k <= i; k++){
                if(i % k == 0)
                    c++;
            }
            if(c == 2){
                System.out.println(i+" ");
            }
        }
    }
}