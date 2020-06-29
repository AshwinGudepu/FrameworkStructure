package stringExamples;

import java.util.Arrays;

public class Anagram {

    public static void withOutUsingFunction() {
        String s1 = "ACT"; //LISTEN
        String s2 = "ACT"; //SILENT
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        for(int i=0;i<s1.length();i++) {
            if (s1.charAt(i)!= s2.charAt(i)){
                System.out.println("Both arrays are not same");
                break;
            }else{
                System.out.println("Both are same");
            }
        }
    }

    public static void main(String args[]){
        Anagram.withOutUsingFunction();
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
