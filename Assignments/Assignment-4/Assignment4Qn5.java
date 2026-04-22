class Student {
    String name;
    int age;

    Student(String name){
        this.name = name;
    }

    Student(String name, int age){
        this(name);
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Assignment4Qn5 {
    public static void main(String[] args){
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Amit",20);

        s1.display();
        s2.display();
    }
}