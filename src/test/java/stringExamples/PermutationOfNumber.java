package stringExamples;

public class PermutationOfNumber {

    //left=0;  right=3
    public void calculate(String str,int left,int right){

        if(left==right){
            System.out.println("--------------"+str);
        }else {
            for(int i=left;i<right;i++) {
                String swapped = swap(str, left, i);
                System.out.println("--------------"+swapped);
                calculate(swapped,left+1,right);
            }
        }
    }

    public static String swap(String str,int i,int j){
     char temp;
     char [] charArray=str.toCharArray();
        temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }

    public static void main(String args[]){
        String word="ABC";
        System.out.println("------------------------------------------"+word.length());
        PermutationOfNumber permutationOfNumber=new PermutationOfNumber();
        permutationOfNumber.calculate(word,0,word.length());
    }
}
