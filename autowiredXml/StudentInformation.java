package autowiredXml;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentInformation {

    public int id;

    public MathsMarks mathsMarks;

    public void setId(int id) {
        this.id = id;
    }

    public void setMathsMarks(MathsMarks mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public void studentMarks(){
        mathsMarks.mathematicsMarks(id);
    }
}
