package autowireWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudentInformation {
    public int id=800;
    public MathsMarks mathsMarks;

    public void setId(int id) {
        this.id = id;
    }

    @Autowired
    @Qualifier("social")
    public void setMathsMarks(MathsMarks mathsMarks) {
        this.mathsMarks = mathsMarks;
    }
    public void studentMarks(){
        mathsMarks.mathematicsMarks(id);
        System.out.println("Subject Name--->"+mathsMarks.getSubjectName());
        System.out.println("Exam Grade---- >"+mathsMarks.getGrade());
    }
}
