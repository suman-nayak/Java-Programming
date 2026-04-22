class Bitwise{
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        int c = a & b;
        System.out.println("The result is: "+ c);

        int d = 2;
        int e = 3;
        int f = d | e;
        System.out.println("the Result: "+ f);

        int r = 9;
        int y = 4;
        int p = r ^ y;
        System.out.println("The Result: "+p);
        
        int w = 1;
        int l = 2;
        int o = ~l;
        System.out.println("The result is: "+ o);

        int t = 4;
        int m = 5;
        int n = t << m;
        System.out.println("Left shift:"+ n);

        int z = 9;
        int x = 3;
        int v = z >> x;
        System.out.println("Right Shift:"+v);
    }
}