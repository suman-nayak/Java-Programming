package pack11;

import java.sql.*;

public class Assignment11Q3 {

    public static void main(String[] args) {
        try {
            String driver = "org.postgresql.Driver";
            String connection_url = "jdbc:postgresql://192.168.1.17/mca_25_db";
            String username = "25mmca01";
            String password = "25mmca01";

            Class.forName(driver);

            Connection con = DriverManager.getConnection(connection_url, username, password);

            String sql = "SELECT * FROM student";

            Statement smt = con.createStatement();

            ResultSet rs = smt.executeQuery(sql);

            System.out.println("Roll\tName\tMobile\t\tEmail\t\tAddress\t\tGender\tCGPA");

            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                long mobile = rs.getLong("mobile");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String gender = rs.getString("gender");
                double cgpa = rs.getDouble("cgpa");

                System.out.println(roll + "\t" + name + "\t" + mobile + "\t" + email + "\t" + address + "\t" + gender + "\t" + cgpa);
            }

            rs.close();
            smt.close();
            con.close();

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}