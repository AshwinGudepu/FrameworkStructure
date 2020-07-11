package automWiredUsingConstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentInformation {

    public int id=800;
    public MathsMarks mathsMarks;

    public StudentInformation(MathsMarks mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Autowired
    public void setMathsMarks(MathsMarks mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public void studentMarks(){
        if(mathsMarks!=null) {
            mathsMarks.mathematicsMarks(id);
        }else{
            System.out.println("**Object is NULL**");
        }
    }
}
