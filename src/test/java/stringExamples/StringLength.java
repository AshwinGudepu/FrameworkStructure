package stringExamples;

import java.util.*;
import java.util.stream.Collectors;

public class StringLength{

        public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("test");
        words.add("redmphne");
        words.add("comp");
        words.add("laptop");
        words.add("software");
        words.add("word");

        Comparator<String> byLength = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        Collections.sort(words, byLength);
        words.sort((e1, e2) -> Integer.compare(e2.length(), e1.length()));
        System.out.println("====="+words);
    }
}
