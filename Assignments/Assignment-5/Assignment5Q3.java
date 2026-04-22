class Employee {
    String name;
    int empid;

    Employee(String name, int empid) {
        this.name = name;
        this.empid = empid;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int empid, int teamSize) {
        super(name, empid);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Director extends Manager {
    String department;

    Director(String name, int empid, int teamSize, String department) {
        super(name, empid, teamSize);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class Assignment5Q3 {
    public static void main(String[] args) {
        System.out.println("--- Employee Details ---");
        Employee emp = new Employee("Nirmal", 101);
        emp.displayDetails();
        System.out.println();

        System.out.println("--- Manager Details ---");
        Manager mgr = new Manager("Suman", 102, 10);
        mgr.displayDetails();
        System.out.println();

        System.out.println("--- Director Details ---");
        Director dir = new Director("Subhaliximi", 103, 50, "Engineering");
        dir.displayDetails();
    }
}