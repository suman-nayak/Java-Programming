import java.util.Scanner;
class EvenThread extends Thread {
    int m, n;
    EvenThread(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public void run() {
        System.out.println("Even numbers:");
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
public class Assignment9Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        EvenThread t = new EvenThread(m, n);
        t.start();

        System.out.println("Odd numbers:");
        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}