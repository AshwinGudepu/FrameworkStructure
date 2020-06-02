package stringExamples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacters {
    public static void main(String [] args) {

        //String duplicateChar = "Testing!!! the application!!! to get the duplicate!!! characters!!!";
        //duplicateChar.replaceAll(" ","");

        String duplicateChar = "applicationthetesting";
        char[] duplicateCharacters = duplicateChar.toLowerCase().toCharArray();
        Map<Character, Integer> characterMap = new HashMap<>();

        for (int i = 0; i < duplicateCharacters.length; i++) {
            Character ch = duplicateCharacters[i];
            if (characterMap.containsKey(ch) == false) {
                characterMap.put(ch, 1);
            }else{
                characterMap.put(ch,characterMap.get(ch)+1);
            }
        }
        Integer maxCharacterRepeated= Collections.max(characterMap.values());
        System.out.println("Max Repeated Character-------------->"+maxCharacterRepeated);
        characterMap.forEach((k, v) -> { if(v==maxCharacterRepeated){
            System.out.println(k + "----------" + v);
            }
        });
    }
}
