interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

class DemoCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class Assignment5Q8 {
    public static void main(String[] args) {
        Calculator c = new DemoCalculator();
        int x = 20, y = 10;

        System.out.println("Add: " + c.add(x, y));
        System.out.println("Sub: " + c.sub(x, y));
        System.out.println("Mul: " + c.mul(x, y));
        System.out.println("Div: " + c.div(x, y));
    }
}