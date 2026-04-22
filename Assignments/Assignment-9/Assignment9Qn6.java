class Student {
    synchronized void study(String subject, int time) {
        System.out.println("Studying " + subject + " for " + time + " seconds");
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Finished studying " + subject);
    }
}

class StudyPlan extends Thread {
    Student student;
    String subject;
    int time;

    StudyPlan(Student student, String subject, int time) {
        this.student = student;
        this.subject = subject;
        this.time = time;
    }

    public void run() {
        student.study(subject, time);
    }
}

public class Assignment9Qn6 {
    public static void main(String[] args) {
        Student s = new Student();

        StudyPlan t1 = new StudyPlan(s, "Java", 2);
        StudyPlan t2 = new StudyPlan(s, "DBMS", 3);
        StudyPlan t3 = new StudyPlan(s, "CN", 2);

        t1.start();
        t2.start();
        t3.start();
    }
}