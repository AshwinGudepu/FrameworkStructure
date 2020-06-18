package stringExamples;

public class StringReverse {

    public static void main(String args[]){

        StringReverse stringReverse=new StringReverse();
   //     stringReverse.primeNumbers();
        String word="aeioutt";
        char [] wordToChar=word.toCharArray();

        for(int i=word.length()-1;i>=0 ;i--){
            System.out.println("<*******>"+wordToChar[i]);
        }
        int vowels=0;
        int consonents=0;

        for(int j=0;j<word.length();j++){
            Character ch= wordToChar[j];
            if(wordToChar[j]=='a' ||wordToChar[j]=='e'||wordToChar[j]=='i'||wordToChar[j]=='o'||wordToChar[j]=='u'){
                vowels=vowels+1;
            }else{
                consonents=consonents+1;
            }
        }
        System.out.println("vowels-----------"+vowels);
        System.out.println("consonents-------"+consonents);
    }
}
