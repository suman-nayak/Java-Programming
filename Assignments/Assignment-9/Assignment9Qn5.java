import java.util.Scanner;

class SquareThread extends Thread {
    int num;
    int square;

    SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        square = num * num;
        System.out.println("Squared by child thread: " + square);
    }
}

public class Assignment9Qn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        SquareThread t = new SquareThread(num);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
        }

        int fact = 1;
        for (int i = 1; i <= t.square; i++) {
            fact *= i;
        }

        System.out.println("Factorial by main thread: " + fact);
    }
}