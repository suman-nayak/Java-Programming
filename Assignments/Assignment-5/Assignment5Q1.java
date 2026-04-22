class Person {
    String name;
    String dob;

    Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    void personDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}

class Employee extends Person {
    String companyName;
    int employeeId;

    Employee(String name, String dob, String companyName, int employeeId) {
        super(name, dob);
        this.companyName = companyName;
        this.employeeId = employeeId;
    }

    void employeeDetails() {
        personDetails();
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Assignment5Q1 {
    public static void main(String[] args) {
        System.out.println("--- Person Object ---");
        Person personObj = new Person("Ravi", "15-08-1990");
        personObj.personDetails();

        System.out.println();

        System.out.println("--- Employee Object ---");
        Employee empObj = new Employee("Arun", "20-05-1985", "Tech Solutions", 101);
        empObj.employeeDetails();
    }
}