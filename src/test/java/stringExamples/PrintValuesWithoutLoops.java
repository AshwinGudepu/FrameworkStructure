package stringExamples;

public class PrintValuesWithoutLoops {

    public void withoutLoop(int sum){
        if(sum<10){
            System.out.println("----------------"+sum);
            withoutLoop(sum+1);
        }
    }

    public static void main(String [] args){
        PrintValuesWithoutLoops printValuesWithoutLoops=new PrintValuesWithoutLoops();
        printValuesWithoutLoops.withoutLoop(0);
    }
}