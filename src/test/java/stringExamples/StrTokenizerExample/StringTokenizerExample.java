package stringExamples.StrTokenizerExample;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String [] args){
        String sentence="Testing test the application";
        StringTokenizer stringTokenizer=new StringTokenizer(sentence);
        System.out.println("Count no of Tokens"+stringTokenizer.countTokens());

        while (stringTokenizer.hasMoreElements()){
            System.out.println("--"+stringTokenizer.nextToken());
        }
        StringTokenizerExample.stringImmutable();
        StringTokenizerExample.stringBufferMutable();
        StringTokenizerExample.stringWrapperImmutable();
        StringTokenizerExample.stringInternExample();
    }

    public static void stringImmutable(){
        String s=new String("Software");
        s.concat("Solutions");
        System.out.println("Immutable Example-->"+"  "+s);
    }

    public static void stringBufferMutable(){
        //equal,hashcode and compareTo are not overridden
        //insert/delete/append
        StringBuffer s=new StringBuffer("Buffered");
        s.append("String");
        System.out.println("SBF Example-->"+"  "+s);
    }

    public static void stringWrapperImmutable(){
        Integer s=new Integer(30);
        s.longValue();
        System.out.println("Immutable Example-->"+"  "+s);
    }

    public static void stringInternExample(){
        String s1=new String("hello");
        String s2="hello";
        if(s1==s2){
            System.out.println("This has to Will not return TRUE");
        }else {
            System.out.println("This has to return FALSE");
        }

        s1=s1.intern();
        if(s1==s2){
            System.out.println("This has to Will return TRUE");
        }else {
            System.out.println("This has to return FALSE");
        }
    }
}
