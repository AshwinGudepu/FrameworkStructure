package collections.hashcodeImmutable;

import groovy.json.JsonOutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomStudExam {
    public static void main(String[] args)
            throws NumberFormatException,
            IOException {
        HashMap<StudentExam, String> map = new HashMap();
        StudentExam one = new StudentExam(1, "Ashwin"); // key1
        StudentExam two = new StudentExam(2, "Gudepu"); // key2

        // put keys in map
        map.put(one, one.getname());
        map.put(two, two.getname());

        // changing key state so that
        // hashcode() should be calculated again
        one.setname("Not Ashwin");
        two.setname("Not Gudepu");

        // still prints Ashwin
        System.out.println(map.get(one));

        // still prints Gudepu
        System.out.println(map.get(two));

        // try with newly created key with same Rollno
        StudentExam three = new StudentExam(1, "WellsFargo");

        // we get Ashwin
        System.out.println(map.get(three));
    }
}