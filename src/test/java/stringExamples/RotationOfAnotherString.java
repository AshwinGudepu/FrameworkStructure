package stringExamples;

public class RotationOfAnotherString {
    public static void main(String [] args){
        String str1="checkrotation";
        String searchString="ioncheck";
        String newString=str1.concat(str1);

        if(newString.contains(searchString)){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }



    }
}
