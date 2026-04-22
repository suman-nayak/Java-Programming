import java.util.*;
class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class Assignment8Qn8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> pq = new PriorityQueue<>(new Comparator<Patient>() {
            public int compare(Patient a, Patient b) {
                return a.severity - b.severity;
            }
        });

        for(int i = 0; i < 5; i++) {
            String name = sc.next();
            int severity = sc.nextInt();
            pq.add(new Patient(name, severity));
        }

        System.out.println("Patients by severity:");
        PriorityQueue<Patient> temp = new PriorityQueue<>(pq);
        while(!temp.isEmpty()) {
            Patient p = temp.poll();
            System.out.println(p.name + " " + p.severity);
        }

        Patient removed = pq.poll();
        System.out.println("Removed most critical: " + removed.name + " " + removed.severity);

        System.out.println("Remaining patients:");
        while(!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " " + p.severity);
        }
    }
}