package stringExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CmpTwoStringsAndDelChars {

    //delete common characters
    public static void main(String args[]) {
        String str1 = "testingQA";
        String str2 = "testingDB";
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        ArrayList<char[]> listOfCharArrays=new ArrayList<>();
        listOfCharArrays.add(str1Char);
        listOfCharArrays.add(str2Char);

        Map<Character, Integer> hashMap = new HashMap<>();

        for (int ar=0;ar<listOfCharArrays.size();ar++) {
            char [] fromAL=listOfCharArrays.get(ar);
            System.out.println("=============================="+listOfCharArrays.get(ar));

            for (int i = 0; i < fromAL.length; i++) {
                Character ch = fromAL[i];
                if (hashMap.containsKey(ch) == false) {
                    hashMap.put(ch, 1);
                } else {
                    hashMap.put(ch, hashMap.get(ch) + 1);
                }
            }
        }

        hashMap.forEach((k,v)->System.out.println(k+"---------------"+v));
        hashMap.entrySet().removeIf((v)->v.getValue()>1);
        hashMap.forEach((k,v)->System.out.println(k+"--Removed Map--"+v));
    }
}
