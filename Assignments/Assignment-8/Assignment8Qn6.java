import java.util.*;
class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

public class Assignment8Qn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Product> list = new LinkedList<>();

        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            list.add(new Product(name, price, rating));
        }

        for(Product p : list) {
            System.out.println(p.name + " " + p.price + " " + p.rating);
        }

        Product max = list.get(0);
        for(Product p : list) {
            if(p.price > max.price) {
                max = p;
            }
        }
        System.out.println("Highest Price Product: " + max.name + " " + max.price + " " + max.rating);

        Collections.sort(list, new Comparator<Product>() {
            public int compare(Product a, Product b) {
                return Double.compare(b.rating, a.rating);
            }
        });

        System.out.println("Sorted by Rating (Descending):");
        for(Product p : list) {
            System.out.println(p.name + " " + p.price + " " + p.rating);
        }

        Iterator<Product> it = list.iterator();
        while(it.hasNext()) {
            if(it.next().rating < 2.5) {
                it.remove();
            }
        }

        System.out.println("After removing rating < 2.5:");
        for(Product p : list) {
            System.out.println(p.name + " " + p.price + " " + p.rating);
        }
    }
}