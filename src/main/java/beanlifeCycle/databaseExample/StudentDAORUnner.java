package beanlifeCycle.databaseExample;

import java.sql.SQLException;

public class StudentDAORUnner {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentDAO dao=new StudentDAO();
        dao.selectAllRows();
        dao.deleteStudentRecord(5);
    }
}
