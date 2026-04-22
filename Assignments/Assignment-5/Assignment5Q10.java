abstract class Employee {
    int id;
    String nm;
    double sl;

    Employee(int i, String n, double s) {
        id = i;
        nm = n;
        sl = s;
    }

    abstract double getSalary();
}

interface Printable {
    void printDetails();
}

class Manager extends Employee implements Printable {

    Manager(int i, String n, double s) {
        super(i, n, s);
    }

    double getSalary() {
        return sl;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + nm);
        System.out.println("Salary: " + getSalary());
    }
}

public class Assignment5Q10 {
    public static void main(String[] args) {
        Manager m = new Manager(101, "Alice", 50000);
        m.printDetails();
    }
}