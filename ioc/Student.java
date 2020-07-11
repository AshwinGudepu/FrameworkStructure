package ioc;

public class Student {

    private int studentId;
    private String studentName;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("Student Name-->" +studentName);
        System.out.println("Student ID-->" +studentId);
    }
}