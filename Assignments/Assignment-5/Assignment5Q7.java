abstract class Employee {
    String nm;
    int id;
    double bs;

    Employee(String n, int i, double b) {
        nm = n;
        id = i;
        bs = b;
    }

    abstract double calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    int ts;
    int pm;

    Manager(String n, int i, double b, int t, int p) {
        super(n, i, b);
        ts = t;
        pm = p;
    }

    double calculateSalary() {
        return bs + ts * 1000 + pm * 2000;
    }

    void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + nm);
        System.out.println("Base Salary: " + bs);
        System.out.println("Team Size: " + ts);
        System.out.println("Projects Managed: " + pm);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Engineer extends Employee {
    String pl;
    int ye;

    Engineer(String n, int i, double b, String p, int y) {
        super(n, i, b);
        pl = p;
        ye = y;
    }

    double calculateSalary() {
        return bs + ye * 500;
    }

    void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + nm);
        System.out.println("Prog Lang: " + pl);
        System.out.println("Experience: " + ye + " years");
        System.out.println("Base Salary: " + bs);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Assignment5Q7 {
    public static void main(String[] args) {
        Manager m = new Manager("Suman", 101, 50000, 5, 2);
        m.displayDetails();

        System.out.println();

        Engineer e = new Engineer("Bob", 102, 40000, "Java", 3);
        e.displayDetails();
    }
}