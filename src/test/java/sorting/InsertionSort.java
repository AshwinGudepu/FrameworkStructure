package sorting;

public class InsertionSort {


    //Thumb Rule-> Take Temp element and compare with sorted list. i.e move towards Left Side of the array
    //If temp element is smaller then move the elements in the sorted list to Right Side
    //We will take the element from the Unsorted List and insert in Sorted list

    //From unsorted sublist, Copy first Index value to temp variable,so that we can override the copied values.
    //Then compare the temp value with the values in the Sorted Set. If the value is smaller, then swap the temp value
    //to the sorted index location, and the value from Sorted list will copied to the temp value Index location

    public static void main(String [] args){

        int[] arrayElements = new int[]{7,10,1};
        int arraySize = arrayElements.length;

        for (int i = 1; i < arraySize; i++) {
            int valueToSort = arrayElements[i];
            int j=i-1;
            while(j>=0 && arrayElements[j]>valueToSort){
                arrayElements[j+1]=arrayElements[j];
                j--;
            }
            arrayElements[j+1]=valueToSort;
            }
        for(int insertionSort: arrayElements){
            System.out.println("============"+insertionSort +",");
        }
    }
}
