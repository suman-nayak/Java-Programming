class Product {
    String nm;
    double pr;

    Product(String n, double p) {
        nm = n;
        pr = p;
    }

    void displayDetails() {
        System.out.println("Product: " + nm);
        System.out.println("Price: " + pr);
    }
}

class Electronics extends Product {
    String br;
    int wp;

    Electronics(String n, double p, String b, int w) {
        super(n, p);
        br = b;
        wp = w;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + br);
        System.out.println("Warranty: " + wp + " months");
    }
}

class Clothing extends Product {
    String sz;
    String mt;

    Clothing(String n, double p, String s, String m) {
        super(n, p);
        sz = s;
        mt = m;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + sz);
        System.out.println("Material: " + mt);
    }
}

public class Assignment5Q4 {
    public static void main(String[] args) {
        Electronics el = new Electronics("Laptop", 45000.0, "Dell", 24);
        Clothing cl = new Clothing("T-Shirt", 500.0, "M", "Cotton");

        el.displayDetails();
        System.out.println();
        cl.displayDetails();
    }
}