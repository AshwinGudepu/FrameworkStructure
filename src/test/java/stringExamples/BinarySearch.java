package stringExamples;

public class BinarySearch {
    public static void main(String args[]) {

        int[] number=new int[]{12,25,30,40,50};
        int end=number.length-1;
        int start=0;
        int searchNumber=40;


        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==searchNumber) {
                System.out.println("Number found at Index" + mid);
                break;
            }else{
                if(searchNumber<number[mid]){
                    end=mid-1;
                }
                else {
                    if(searchNumber > number[mid]){
                        start=mid+1;
                    }
                }
            }
        }
    }
}
