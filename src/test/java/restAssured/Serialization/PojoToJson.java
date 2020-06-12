package restAssured.Serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PojoToJson {

    @Test
    public void convertPojoToJson() throws IOException {
        Student sdent=new Student();
        sdent.setId(10);
        sdent.setName("Testing");
        sdent.setSkill("QA");

        sdent.setId(200);
        sdent.setSkill("Develop");
        sdent.setSkill("Dev");

        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(new File("E:\\TestData\\creatingJsonFile\\student.json"),sdent);

        //**Convert Java Objects to JSON String--> Serialization
        //Normal print
        String json1 = mapper.writeValueAsString(sdent);
        System.out.println("Normal print: \n" + json1);
    }

}


