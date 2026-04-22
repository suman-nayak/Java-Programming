class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Assignment9Qn4 {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
        }

        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println(ch);
        }
    }
}