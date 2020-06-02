package stringExamples;

public class TwoMaxNumbers {

    public static void main(String [] args){
        int [] numbers=new int[]{300,20,150,240,10,290};
        int temp=0;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1;j++){
                if(numbers[j]<numbers[j+1]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        for(int i=0;i<2;i++){
            System.out.println("Two MAX numbers" +numbers[i]);
        }
    }
}
