package stringExamples;

public class StringReverse {
    public static void main(String args[]){
        String word="STABLE";
        char [] wordToChar=word.toCharArray();

        for(int i=word.length()-1;i>=0 ;i--){
            System.out.println("<*******>"+wordToChar[i]);
        }
    }
}
