package collections.CustomClassObjects;

public class Student {

    @Override
    public boolean equals(Object o) {
        //First Step check object;
        if (this == o) { return true;} //if both objects equal like student1=student2;
        if (o == null ) { return false;}
        if(getClass() != o.getClass()) { return false;} //instance comparing

        Student student = (Student) o;
        return this.age == student.age && this.name.equals(student.name);
    }

    @Override
    public int hashCode() {
        final int temp=31;
        int value=1;
        value=temp * value + age ;
        value = temp * value + ((name == null) ? 0 : name.hashCode());
        return value;
    }

    private String name;
    private int age;
    private int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
