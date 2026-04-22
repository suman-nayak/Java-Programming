class PrintA extends Thread {
    int n;

    PrintA(int n) {
        this.n = n;
    }

    public void run() {
        try {
            for (int i = 1; i <= n; i++) {
                System.out.println("A");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}
class PrintB extends Thread {
    int m;
    PrintB(int m) {
        this.m = m;
    }
    public void run() {
        try {
            for (int i = 1; i <= m; i++) {
                System.out.println("B");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}
class PrintNumbers extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}
public class Assignment9Qn3 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        PrintA t1 = new PrintA(n);
        PrintB t2 = new PrintB(m);
        PrintNumbers t3 = new PrintNumbers();

        t1.start();
        t2.start();
        t3.start();
    }
}