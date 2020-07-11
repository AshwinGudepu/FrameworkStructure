package beanlifeCycle.databaseExample;

import java.sql.*;

public class StudentDAO {

    private String driver = "com.mysql.jdbc.driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/ESNew";
    private String userName = "root";
    private String password = "password";

    public static Connection con;
    public Statement stmt;
    public ResultSet rs;

    public void createConnectionObject() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement stmt = con.createStatement();
    }

    public void selectAllRows() throws ClassNotFoundException, SQLException {
        rs = stmt.executeQuery("Select * from ESNew.HostelStudentInfo;");
        while (rs.next()) {
            int studentId = rs.getInt(1);
            String studentName = rs.getString(2);
            System.out.println("Student ID   " + studentId);
            System.out.println("Student Name " + studentName);
        }
    }

    public void deleteStudentRecord(int id) throws ClassNotFoundException, SQLException {
        stmt.executeUpdate("Delete from ESNew.HostelStudentInfo where studentId=" + id);
    }

    public void closeConnection() throws SQLException {
        con.close();
    }
}
