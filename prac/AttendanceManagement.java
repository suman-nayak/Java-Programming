import java.util.Scanner;

public class AttendanceManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] attendance = new double[n];

        System.out.println("Enter attendance percentage of each student:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            attendance[i] = sc.nextDouble();
        }

        int defaulterCount = 0;

        System.out.println("\nAttendance Status:");
        for (int i = 0; i < n; i++) {
            if (attendance[i] < 75) {
                System.out.println("Student " + (i + 1) + " is a Defaulter");
                defaulterCount++;
            } else {
                System.out.println("Student " + (i + 1) + " is Not a Defaulter");
            }
        }
        
        System.out.println("\nTotal number of defaulters: " + defaulterCount);

        sc.close();
    }
}
