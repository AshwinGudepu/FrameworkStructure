package stringExamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestConsecutivePositiveNumbers {
    public static void main(String args[]){
        int [] numbers=new int[]{-2,3,-4,5,6,9,-1,1,2,8,9,-1,2,3,4,5,6,7,99,-90,10};
        int temp=0;
        List<Integer> maxNumber=new ArrayList<>();
        int max=0;
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]>=0){
                temp=temp+1;
                if(i==numbers.length-1){
                    maxNumber.add(temp);
                }
            }else{
                maxNumber.add(temp);
                temp=0;
            }
        }
        System.out.println("============"+ Collections.max(maxNumber));
    }
}
