package pack11;

import java.sql.*;
import java.util.Scanner;

public class Assignment11Q2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            String driver = "jdbc:postgresql://192.168.1.17/mca_25_db";
            String username = "25mmca01";
            String password = "25mmca01";

            System.out.print("Roll: ");
            int roll = Integer.parseInt(sc.nextLine());

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Mobile: ");
            long mobile = Long.parseLong(sc.nextLine());

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("CGPA: ");
            double cgpa = Double.parseDouble(sc.nextLine());

            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(driver, username, password);

            String qry = "INSERT INTO student(roll, name, mobile, email, address, gender, cgpa) VALUES(" 
                        + roll + ", '" + name + "', " + mobile + ", '" + email + "', '" + address + "', '" + gender + "', " + cgpa + ")";

            Statement smt = con.createStatement();

            int i = smt.executeUpdate(qry);

            if (i == 1) {
                System.out.println("Row(s) Inserted");
            }

            con.close();

        } catch (ClassNotFoundException ce) {
            System.out.println(ce);
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
}