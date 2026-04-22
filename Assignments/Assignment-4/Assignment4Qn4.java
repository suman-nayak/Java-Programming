class Student {
    static int nextId = 100;
    String name;
    int rollNumber;

    Student(String name){
        this.name = name;
        rollNumber = nextId;
        nextId++;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class Assignment4Qn4 {
    public static void main(String[] args){
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();
    }
}