package restAssured.Serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JsonToPojo {

    @Test
    public void createJsonToPojo() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        FileInputStream fileInputStreamObj = new FileInputStream("E:\\TestData\\creatingJsonFile\\student.json");
        Student student=mapper.readValue(fileInputStreamObj,Student.class);


        //**Print POJOs
        System.out.println("Student ID : " + student.getId());
        System.out.println("Student Name : " + student.getName());
        System.out.println("Student Skill : " + student.getSkill());

        fileInputStreamObj.close();
    }
}
