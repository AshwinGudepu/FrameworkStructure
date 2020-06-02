package sorting;

public class MergeSort {
    //Divide and conquer algorithm
    //Array is divided into parts.
    //It is also called as recursive algorithms
    //First list is divided into two parts. the list is further into parts until all elements become individual
    //mergeSort(arr,loweBound,midValue)
    //mergeSort(arr,midValue+1,upperBound)
    //merge(lowerBound,mid,upperBound)

    public void printArray(int[] array){
        for(int i: array){
            System.out.println("------------"+i+" ");
        }
    }

    public int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int midPoint = array.length / 2;

        int[] left = new int[midPoint];
        int[] right ;

        if (array.length % 2 == 0) {
            right = new int[midPoint];
        } else {
            right = new int[midPoint + 1];
        }

        //LowerBound to MidValue
        for (int i = 0; i < midPoint; i++) {
            left[i] = array[i];
        }

        //Midvalue+1 to UpperBound i.e last value in the array
        for (int j = 0; j < right.length; j++) {
            right[j] = array[midPoint + j];
        }

        int result[] = new int[array.length];

        left = mergeSort(left);
        right = mergeSort(right);
        result = mergeSort(left, right);
        return result;
    }

    public int[] mergeSort(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {

            if (leftPointer < left.length && rightPointer < right.length) {

                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //fist calculated midvalue , divided the array into two parts.
        // lowerBound-> array starts from Zero to mid value,and UpperBound-> array starts from mid+1 to Maximum size of array
        //function(lowerbound,midvalue)
        //function(midvalue+1,upperbound)
        //merge(lowerbound,mid,upperbound)

        MergeSort sortElements=new MergeSort();
        int[] arrayElements = new int[]{31,20,23,4,5};

        arrayElements=sortElements.mergeSort(arrayElements);
        sortElements.printArray(arrayElements);
    }
}
