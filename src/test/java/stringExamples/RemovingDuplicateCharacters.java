package stringExamples;

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
        characterMap.entrySet().removeIf(v->v.getValue()>1);
        characterMap.forEach((k,v)->System.out.println(k+"----------"+v));
    }
}
