package stringExamples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemovingDuplicateCharacters {
    public static void main(String [] args){
        String duplicateChar="testing";
        char [] duplicateCharacters=duplicateChar.toLowerCase().toCharArray();
        Map<Character,Integer> characterMap=new HashMap<>();

        for(int i=0;i<duplicateCharacters.length;i++){
            Character ch=duplicateCharacters[i];
            if(characterMap.containsKey(ch)==false){
                characterMap.put(ch, 1);
            }else{
                characterMap.put(ch,characterMap.get(ch)+1);
            }
        }
        Collections.max(characterMap.values());
        characterMap.entrySet().removeIf(v->v.getValue()>1);
        characterMap.forEach((k,v)->System.out.println(k+"----------"+v));

      /*  Iterator<Map.Entry<String,String>> iter = testMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,String> entry = iter.next();
            if("Sample".equalsIgnoreCase(entry.getValue())){
                iter.remove();
            }
        }
        testMap.entrySet().removeIf(entry -> "Sample".equalsIgnoreCase(entry.getValue()));*/
    }
}
