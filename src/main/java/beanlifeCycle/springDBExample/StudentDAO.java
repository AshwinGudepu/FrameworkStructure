package beanlifeCycle.springDBExample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

public class StudentDAO {

    private String driver;
    private String url;
    private String userName;
    private String password;

    public void setDriver(String driver) {
        this.driver = driver;
        System.out.println("Step---->1");
    }

    public void setUrl(String url) {
        this.url = url;
        System.out.println("Step---->2");
    }

    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println("Step---->3");
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Step---->4");
    }

    @PostConstruct
    public void initialize() throws SQLException {
        con.createStatement();
        System.out.println("STEP---5");
    }

    @PreDestroy
    public void destroyContainer() throws SQLException {
        con.close();
        System.out.println("STEP---6");
    }

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
