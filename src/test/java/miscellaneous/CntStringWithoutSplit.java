package miscellaneous;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CntStringWithoutSplit {
    @Test
    public void test_lengthOfStringWithMap() {
        String testExam = "The application is tested thoroughly.Hence the application is stable";
        String addCharacters = " ";
        Integer charCount = 0;
        Map<String, Integer> addMap = new HashMap<>();
        for (int i = 0; i < testExam.length(); i++) {
            if (testExam.charAt(i) != ' ' && testExam.charAt(i) != '.') {
                System.out.println("Number of Spaces-->" + testExam.charAt(i));
                addCharacters = addCharacters + testExam.charAt(i);
                charCount = charCount + 1;
                if (i == testExam.length() - 1) {
                    addMap.put(addCharacters, charCount);
                }
            } else {
                addMap.put(addCharacters, charCount);
                charCount = 0;
                addCharacters = "";
            }
        }
        addMap.forEach((K, V) -> System.out.println(K + "-----" + V));
    }

    @Test
    public void test_lengthOfStringWithList() {
        String testExam = "The application is tested thoroughly.Hence the application is stable";
        String addCharacters = " ";
        Integer charCount = 0;
        List<Integer> addToList = new ArrayList<>();
        for (int i = 0; i < testExam.length(); i++) {
            if (testExam.charAt(i) != ' ' && testExam.charAt(i) != '.') {
                System.out.println("Number of Spaces-->" + testExam.charAt(i));
                addCharacters = addCharacters + testExam.charAt(i);
                charCount = charCount + 1;
                if (i == testExam.length() - 1) {
                    addToList.add(charCount);
                }
            } else {
                addToList.add(charCount);
                charCount = 0;
                addCharacters = "";
            }
        }
        addToList.forEach((V) -> System.out.println("-----" + V));
    }

    @Test
    public void test_lengthOfStringWithOutSplit() {
        String str = "Testing the application. Application is tested thoroughly and application is stable";
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                numCount++;
                System.out.println(numCount);
            }
        }
        System.out.println("number count " + (numCount + 1));
    }
}
