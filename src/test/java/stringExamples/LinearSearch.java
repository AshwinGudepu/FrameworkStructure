package stringExamples;

public class LinearSearch {
    public static void main(String args[]){
        int[] number=new int[]{12,25,30,40,50};
        int end=number.length-1;
        int start=0;
        int searchNumber=40;

        for(int i=0;i<number.length;i++){
            if(searchNumber==number[i]){
                System.out.println("Element found at INDEX---"+"  " +i);
            }
        }
    }
}
