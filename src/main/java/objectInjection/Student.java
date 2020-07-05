package objectInjection;

public class Student {

    public MathsMarks mathsMarks;
    public int rollNumber;

    public void setMathsMarks(MathsMarks mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void totalMarks(){
        System.out.println("Maths Marks"+rollNumber);
        System.out.println("Total Marks for Marks");
        mathsMarks.mathematicsMarks();
    }

}
