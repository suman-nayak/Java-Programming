import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Assignment4Qn1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();

        Employee e = new Employee(id, name, salary);
        e.display();
    }
}