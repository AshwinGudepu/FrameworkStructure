package beanlifeCycle.springDBExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class StudentDAORunner {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Check object is created or not---->" +context);
        StudentDAO  studentRecords=context.getBean("studentDaoObject",StudentDAO.class);
        studentRecords.selectAllRows();
    }
}
