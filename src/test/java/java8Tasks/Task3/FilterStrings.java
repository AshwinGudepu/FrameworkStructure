package java8Tasks.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*       Problem 3)
         Filter Strings(Java 8 java8Tasks.Lambdas and java8Tasks.Streams)
         Given a list of Strings,write a method that returns a list of all strings
        that start with the letter'a'(lower case)and have exactly 3 letters.
        TIP:Use Java 8 java8Tasks.Lambdas and java8Tasks.Streams API's. – 2 Marks
        public List<String> search(List<String> list){
        }
*/
public class FilterStrings {

    public List<String> search(List<String> stringsList, String startingLetter) {
        List<String> listOfString = stringsList.stream().filter(i -> i.startsWith(startingLetter)).filter(i -> i.length() == 3).collect(Collectors.toList());
        return listOfString;
    }

    public static void main(String args[]) {
        FilterStrings filterStrings = new FilterStrings();
        System.out.println(filterStrings.search(Arrays.asList("Ash", "Naveen", "Navin", "ash"), "a"));
        System.out.println(filterStrings.search(Arrays.asList("Srinath", "Srinivas", "Sai", "sai"), "s"));
    }
}
