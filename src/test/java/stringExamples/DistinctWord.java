package stringExamples;

import java.util.HashMap;
import java.util.Map;

public class DistinctWord {
    public static void main(String args[]) {
        String distinctWord = "I brought new laptop and my new laptop crashed";
        String[] word = distinctWord.split(" ");
        System.out.println("***Size of String Array--->" + word.length);
        Map<String, Integer> distinctMapCount = new HashMap<>();

        for (int i = 0; i < word.length; i++) {
            String individualWord = word[i];
            if (distinctMapCount.containsKey(individualWord) == false) {
                distinctMapCount.put(individualWord, 1);
            } else {
                distinctMapCount.put(individualWord, distinctMapCount.get(individualWord) + 1);
            }
        }
        distinctMapCount.forEach((k, v) -> {
            if (v == 1) {
                System.out.println(k + "--------------------" + v);
            }
        });
    }
}
