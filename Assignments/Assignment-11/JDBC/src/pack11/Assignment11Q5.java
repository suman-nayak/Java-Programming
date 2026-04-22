package pack11;

import java.sql.*;
import java.util.Scanner;

public class Assignment11Q5 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
            String username = "25mmca01";
            String password = "25mmca01";

            System.out.print("Enter Roll to delete: ");
            int roll = Integer.parseInt(sc.nextLine());

            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(connection_url, username, password);

            String qry = "DELETE FROM student WHERE roll=" + roll;

            Statement smt = con.createStatement();

            int i = smt.executeUpdate(qry);

            if (i == 1) {
                System.out.println("Row(s) Deleted");
            } else {
                System.out.println("Delete Failed. Check Roll");
            }

            con.close();

        } catch (ClassNotFoundException ce) {
            System.out.println(ce);
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
}