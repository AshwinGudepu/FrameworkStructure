package sorting;

public class BubbleSort {

    //In bubble sort algorithm, array is traversed from first element to last element.
    // Here, current element is compared with the next element only. Example: a,b,c -> a is compared with ,
    // and b is compared with c
    // If current element is greater than the next element, it is swapped.
    // Number of Iterations will ne N-1;
    // Suppose let us take there are 5 elements. The number of iteration will be 4.
    // The comparision in the first iteration will be 4 times, it can calculated based on n-1. Here the tricky is index should
    // start from 1.  First Iteration it will be 5-1=4. On the fourth comparision the Largest element will be bubbled
    //For the Fourth iteration only one Comparision is required. That Number of elements are 5 and if subtracted
    // based on the index value, it will be 5-4=1. (as discussed the index value should start from 1,2,3,4,5.)

    static void bubbleSort(int[] arr) {
        int sizeOfArray = arr.length;
        int temp = 0;
        int FLAG = 0;
        for (int i = 0; i < sizeOfArray-1; i++) {
            for (int j = 0; j < sizeOfArray-1; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap elements
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    FLAG++;
                }
            }
            if(FLAG==0){
                System.out.println("Elements Sorted");
                break;
            }
        }
    }

    public static void main(String [] args){

        int arr[] ={3,60,35,2,45,320,5};

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int j=0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
