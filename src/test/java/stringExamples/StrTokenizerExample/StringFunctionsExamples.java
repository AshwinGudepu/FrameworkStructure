package stringExamples.StrTokenizerExample;

import org.testng.annotations.Test;

public class StringFunctionsExamples {

    @Test
    public void stringSubStringExample(String word){
        String testString="liril";
        //start and End index
        System.out.println("Testing Substring-->"+testString.substring(2,testString.length()));


        if(testString.charAt(0)==testString.charAt(testString.length()-1)) {
            testString.substring(1, testString.length() - 1);
            System.out.println("*************============>");
            stringSubStringExample(word.substring(1,word.length()-1));
        }

    }
}
