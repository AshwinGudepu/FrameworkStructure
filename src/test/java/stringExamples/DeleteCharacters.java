package stringExamples;

import org.testng.annotations.Test;

import java.util.*;

public class DeleteCharacters {

    @Test
    public void test_DeleteCharacters(){
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
        Integer charValue= Collections.max(characterMap.values());
        Iterator<Map.Entry<Character,Integer>> delCharIterator=characterMap.entrySet().iterator();
        while(delCharIterator.hasNext()){
            if(delCharIterator.next().getValue()>=charValue){
                delCharIterator.remove();
            }
        }
        characterMap.forEach((k,v)->System.out.println(k+"-------"+v));
    }

    @Test
    public void test_removeMapKey(){
        Map<String,Integer> removeEle=new HashMap<>();
        removeEle.put("Test",100);
        removeEle.put("Software",300);
        removeEle.put("Computer",200);
        System.out.println("------------"+removeEle.remove("Test"));
        removeEle.forEach((key,value)->System.out.println(key+"---------"+value));
    }
}
