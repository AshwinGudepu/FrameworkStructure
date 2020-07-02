package stringExamples;

import java.util.*;

public class PalindromeTest {

    //The Stack class represents a last-in-first-out (LIFO) stack of objects.

    public static void main(String args[]){
        String inputString="liril";

        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop(); //removes element
            //System.out.println("------------"+stack.size());
            //empty()---Tests if this stack is empty.
            //peek() ---Looks at the object at the top of this stack without removing it from the stack.
            //pop()---Removes the object at the top of this stack and returns that object as the value of this function.
            //push​(E item)--Pushes an item onto the top of this stack.
            //search​(Object o)---Returns the 1-based position where an object is on this stack.
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");


    }
}
