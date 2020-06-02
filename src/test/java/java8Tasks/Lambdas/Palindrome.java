package java8Tasks.Lambdas;

import jdk.nashorn.internal.objects.NativeFunction;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Palindrome {

    public void palindromeTest(String wordTes){
        String word=wordTes;
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            System.out.println("-------------"+i);
            reverse=reverse+word.charAt(i);
        }
        System.out.println("-reverse--------------"+reverse);
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }

    public static boolean palindromeTestWithStringBuffer(String wordTest){
        String reverseString=new StringBuffer(wordTest).reverse().toString();
        if(reverseString.equals(wordTest)){
            System.out.println("GIVEN WORD IS PALINDROME");
            return true;
        }else {
            System.out.println("GIVEN WORD IS NOT PALINDROME");
            return false;
        }
    }

    public static boolean withLambdasPalindromeTest(String wordToTest){
        return IntStream.range(0, wordToTest.length() / 2)
                .allMatch(i -> wordToTest.charAt(i) == wordToTest.charAt(wordToTest.length() - i - 1));
    }
    /*1. Check if a given string is a palindrome*/
    public static void main(String args[]){
        Palindrome palindrome=new Palindrome();
        palindrome.palindromeTest("LIRIL");
        palindrome.palindromeTest("HOME");
        System.out.println("Not Palindrome"+Palindrome.withLambdasPalindromeTest("HELLO"));
        System.out.println("Palindrome"+Palindrome.withLambdasPalindromeTest("LIRIL"));
        System.out.println("Not Palindrome"+Palindrome.withLambdasPalindromeTest("TAKE"));
        System.out.println("Palindrome"+Palindrome.withLambdasPalindromeTest("RADAR"));
        System.out.println("===============STRING BUFFER==============="+"\n");
        System.out.println("String Buffer-----" +Palindrome.palindromeTestWithStringBuffer("Helo"));
        System.out.println("String Buffer-----" +Palindrome.palindromeTestWithStringBuffer("REQER"));
        System.out.println("String Buffer-----" +Palindrome.palindromeTestWithStringBuffer("ASHSA"));
    }
}
