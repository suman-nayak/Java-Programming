import java.util.*;
class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class Assignment8Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            double salary = sc.nextDouble();
            list.add(new Employee(name, age, salary));
        }

        for(Employee e : list) {
            System.out.println(e.name + " " + e.age + " " + e.salary);
        }

        double sum = 0;
        for(Employee e : list) {
            sum += e.salary;
        }
        System.out.println("Average Salary: " + (sum / list.size()));

        Employee max = list.get(0);
        for(Employee e : list) {
            if(e.salary > max.salary) {
                max = e;
            }
        }
        System.out.println("Highest Paid: " + max.name + " " + max.salary);

        Collections.sort(list, new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("Sorted by Name:");
        for(Employee e : list) {
            System.out.println(e.name + " " + e.age + " " + e.salary);
        }

        Iterator<Employee> it = list.iterator();
        while(it.hasNext()) {
            if(it.next().age > 60) {
                it.remove();
            }
        }

        System.out.println("After removing age > 60:");
        for(Employee e : list) {
            System.out.println(e.name + " " + e.age + " " + e.salary);
        }
    }
}