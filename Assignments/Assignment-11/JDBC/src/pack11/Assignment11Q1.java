package pack11;

import java.sql.*;

public class Assignment11Q1 {

    public static void main(String[] args) {
        try {
            String driver = "jdbc:postgresql://192.168.1.17/mca_25_db";
            String username = "25mmca01";
            String password = "25mmca01";

            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(driver, username, password);

            String qry = "CREATE TABLE student(roll INT, name VARCHAR(255), mobile BIGINT, email VARCHAR(255), address VARCHAR(255), gender VARCHAR(10), cgpa DOUBLE PRECISION)";

            Statement smt = con.createStatement();

            int i = smt.executeUpdate(qry);

            if (i == 0) {
                System.out.println("Student Table Created");
            }

            con.close();

        } catch (ClassNotFoundException ce) {
            System.out.println(ce);
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
}