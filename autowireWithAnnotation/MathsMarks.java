package autowireWithAnnotation;

public class MathsMarks {
    private String subjectName;
    private String grade;

    public String getSubjectName() {
        return subjectName;
    }

    public String getGrade() {
        return grade;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setGrade(String grade) {
        this.grade = grade;;
    }

    public void mathematicsMarks(int marks){
        System.out.println("Mathematics Marks-->"+marks);
    }
}
