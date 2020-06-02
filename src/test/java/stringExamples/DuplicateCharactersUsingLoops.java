package stringExamples;

public class DuplicateCharactersUsingLoops {
    public void usingArrayList() {
        String duplicateChar = "testing";
        char[] characters = duplicateChar.toCharArray();
        String newString = "";
        for (int i = 0; i < characters.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < characters.length - 1; j++) {
                if (characters[i] == characters[j]) {
                    count = count + 1;
                    newString = newString + characters[i] + "" + count;
                }
            }
        }
        System.out.println("Main String====>>>>>" + newString);
    }



    public static void main(String args[]){
        DuplicateCharactersUsingLoops duplicateCharactersUsingLoops=new DuplicateCharactersUsingLoops();
        duplicateCharactersUsingLoops.usingArrayList();
    }
}
