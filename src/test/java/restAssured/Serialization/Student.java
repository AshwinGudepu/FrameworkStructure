package restAssured.Serialization;

public class Student {
    int id;
    String name;
    String skill;
    Marks studentMarks;

    public Marks getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Marks studentMarks) {
        this.studentMarks = studentMarks;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
}
