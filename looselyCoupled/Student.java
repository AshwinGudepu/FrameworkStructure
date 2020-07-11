package looselyCoupled;

public class Student {

    public Marks marks;
    public int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

     public void studentMarks(){
        marks.subject();
     }
}
