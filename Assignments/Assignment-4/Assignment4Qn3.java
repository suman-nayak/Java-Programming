class Student {
    String name;
    int age;
    int roll;
    static int count = 0;

    Student(){
        name = "Unknown";
        age = 18;
        roll = 0;
        count++;
    }

    Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
        count++;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
    }

    static void showCount(){
        System.out.println("Total Students: " + count);
    }
}

public class Assignment4Qn3 {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Rahul",20,101);
        Student s3 = new Student("Amit",21,102);

        s1.display();
        s2.display();
        s3.display();

        Student.showCount();
    }
}