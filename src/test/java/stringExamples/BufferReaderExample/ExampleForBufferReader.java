package stringExamples.BufferReaderExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

public class ExampleForBufferReader {
    public static void main(String args[]) throws Exception {

        //input data
        //4
        //7 8 9

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        String secondLine = br.readLine();  //Reading input from STDIN

        String removeSpace = secondLine.replaceAll(" ", ",") +","+ firstLine;
        String [] stringSplit=removeSpace.split(",");
        List<Integer> addNumbers = new ArrayList<>();
        for (int i = 0; i < stringSplit.length; i++) {
            addNumbers.add(Integer.parseInt(String.valueOf(stringSplit[i])));
        }
        System.out.println(Collections.min(addNumbers));
    }
}