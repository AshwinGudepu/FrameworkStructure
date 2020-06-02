package stringExamples;

public class SelectionSort {

    public static void main(String [] args){
        int[] number=new int[]{89,45,68,90,29,17};
        int temp;
        for(int i=0;i<number.length-1;i++){
            int min=i;
            for(int j=i+1;j<number.length;j++){
                if(number[j]<number[min]){
                    min=j;
                }
            }
            int smallNumber=number[min];
            number[min]=number[i];
            number[i]=smallNumber;
        }

        System.out.println("After Selection Sort");
        for(int i:number){
            System.out.print(i+" ");
        }
    }
}
