package stringExamples;

import java.util.Arrays;

public class Anagram {
    public static void main(String args[]){
        String s1="CAT"; //LISTEN
        String s2="ACT"; //SILENT
        if(s1.toLowerCase().length()==s2.toLowerCase().length()){
           char [] str1= s1.toCharArray();
            char [] str2= s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str1);
            boolean status=Arrays.equals(str1,str2);
            if(status) {
                System.out.println("TRUE");
            }else {
                System.out.println("FALSE");
            }
        }
    }
}
