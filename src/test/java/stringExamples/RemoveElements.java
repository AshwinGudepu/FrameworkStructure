package stringExamples;

import org.apache.commons.lang3.ArrayUtils;

import java.sql.SQLOutput;
import java.util.*;

public class RemoveElements {

    public void maxSubString(String subString){
      //  String word = "abdcbe";   //abdc, bdc, dcb, cbe, be,e
        String word = subString;//abc, bca, cab, abcd, bcd,cd,d
        Map<Character,Integer> testMap=new HashMap<>();
        testMap.clear();
        char [] cw=word.toCharArray();
        Map<String,Integer> stringMap=new HashMap<>();
        stringMap.clear();

        for(int i=0;i<word.length();i++){
            String addedStrings="";
            for(int j=i;j<word.length();j++) {
                Character ch = cw[j];
                if (!testMap.containsKey(ch)) {
                    testMap.put(ch, 1);
                    addedStrings =addedStrings+String.valueOf(ch);
                    if(j==word.length()-1){
                         stringMap.put(addedStrings,addedStrings.length());
                         testMap.clear();
                    }
                } else {
                    stringMap.put(addedStrings,addedStrings.length());
                    testMap.clear();
                    break;
                }
            }
        }
        Integer maxString=Collections.max(stringMap.values());
        System.out.println("MAX STRING---------------"+maxString);
        for(Map.Entry<String,Integer> collectedString: stringMap.entrySet()){
                if(maxString==collectedString.getValue()){
                    System.out.println(collectedString.getKey());
                    System.out.println("********************************");
                    System.out.println(collectedString.getValue());
                }
        }
    }

    public static void main(String[] args) {
        RemoveElements removeElements=new RemoveElements();
        removeElements.maxSubString("abcabcdd");
        removeElements.maxSubString("abcdef");
        removeElements.maxSubString("abcdefeghiklm");
   /*     String word = "abcdefeghiklm ";
       int maxCount=0;
       int i=0;
       int j=0;
       String getStrng="";
       Set<Character> st=new HashSet<>();

       while(i< word.length() && j<word.length()){
           Character s=word.charAt(j);
            if(!st.contains(word.charAt(j))){
                st.add(word.charAt(j));
                j++;
                maxCount=Math.max(maxCount,j-i);
            }else {
                st.remove(word.charAt(i));
                i++;
            }
       }
        System.out.println("<<<------->>>"+maxCount);
       st.forEach(System.out::print);
   */ }
}
