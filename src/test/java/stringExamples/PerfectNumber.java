package stringExamples;

public class PerfectNumber {
    public static void main(String [] args){
        int number=496; //6,28
        int perfectNumber=number;
        int reminder=0;
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
            }
        }
        if(perfectNumber==sum) {
            System.out.println("Perfect Number--->" + sum);
        }else {
            System.out.println("NOT Perfect Number--->" + sum);
        }
    }
}
