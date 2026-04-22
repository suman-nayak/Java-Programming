public class Assignment9Qn1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Assignment9Qn1 obj = new Assignment9Qn1();
        Thread t = new Thread(obj);
        t.start();
    }
}