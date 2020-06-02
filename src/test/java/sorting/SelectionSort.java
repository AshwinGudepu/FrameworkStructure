package sorting;

public class SelectionSort {
    //In the Selection sort we have Sorted Sub Array and Unsorted Sub-array
    //Generally First Element is called Sorted Array and remaining elements are called Unsorted Array
    //Main Logic:
    //Identify the Minimum element in the unsorted array and swap to the beginning place in the unsorted array
    //for n number of elements, the swapping will be n-1. Example if there are six elements the we will iterate or swap 5 times

    public static void main(String[] args) {

        int[] arrayElements = new int[]{7,10,1,5,2};
        int arraySize = arrayElements.length;

        for (int i = 0; i < arraySize-1; i++) {
            int min = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (arrayElements[j] < arrayElements[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int smallerNumber = arrayElements[min];
                arrayElements[min] = arrayElements[i];
                arrayElements[i] = smallerNumber;
            }
        }
        for (int sortedArray : arrayElements) {
            System.out.print(sortedArray);
            System.out.print(", ");

        }
    }
}

