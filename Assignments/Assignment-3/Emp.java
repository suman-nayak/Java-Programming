import java.util.Scanner;

class Employee {

    int id;
    String name;
    double salary;

    // Parameterized Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp[] = new Employee[5];

        // Runtime initialization
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter details of Employee " + (i+1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(id, name, salary);
        }

        // Display all employees
        System.out.println("\nEmployee Details:");
        for(int i = 0; i < 5; i++) {
            emp[i].display();
        }

        // Search employee with id 101
        boolean found = false;
        for(int i = 0; i < 5; i++) {
            if(emp[i].id == 101) {
                System.out.println("Employee with ID 101 found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Employee with ID 101 not found.");
        }

        // Find highest salary
        double maxSalary = emp[0].salary;
        String highestPaid = emp[0].name;

        double totalSalary = emp[0].salary;

        for(int i = 1; i < 5; i++) {
            totalSalary += emp[i].salary;

            if(emp[i].salary > maxSalary) {
                maxSalary = emp[i].salary;
                highestPaid = emp[i].name;
            }
        }

        System.out.println("Highest Paid Employee: " + highestPaid);
        System.out.println("Highest Salary: " + maxSalary);

        // Average salary
        double avg = totalSalary / 5;
        System.out.println("Average Salary: " + avg);

        sc.close();
    }
}