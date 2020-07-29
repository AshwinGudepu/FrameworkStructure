package collections.hashcodeImmutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentExam {

    private int rollno;
    private String name;

    // Constructor
    public StudentExam(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    public String getname()
    {
        return this.name;
    }

    public int getmarks()
    {
        return this.rollno;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public void setmarks(int rollno)
    {
        this.rollno = rollno;
    }

    // Overriding the hashcode() function
    @Override
    public int hashCode()
    {
        // uses roll no to verify the uniqueness
        // of the object of Student class
        final int temp = 14;
        int ans = 1;
        ans = temp * ans + rollno;
        return ans;
    }

    // Equal objects must produce the same
    // hash code as long as they are equal
    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        StudentExam other = (StudentExam)o;
        if (this.rollno != other.rollno) {
            return false;
        }
        return true;
    }
}
