package searchingTechnique;

import java.util.Arrays;

public class BinarySearch {
    //The Array should be in sorted before applying Search
    //When we are moving towards right, mid Value will be mid+1
    //When moving towards Left, mid value will be mid-1

    //There are three Rules
    //Rule1: SearchElement is equal to Middle element
    //Rule2: if SearchElement > Middle Element  --In this case Start Bound will be mid+1
    //Rule3: if SearchElement < Middle Element  --In this case End Bound will be mid-1

    //if mid value is equal to Search element, then this the Search Index. Note: Left and Right will be at Mid value

    public static void binarySearch(int[] input, int searchElement) {
        int firstIndex = 0;
        int lastIndex = input.length - 1;
        int middle = (firstIndex + lastIndex) / 2;

        while (firstIndex <= lastIndex) {
            if (input[middle] < searchElement) {
                firstIndex = middle + 1;
            } else if (input[middle] == searchElement) {
                System.out.printf(searchElement + " found at location %d %n", middle);
                break;
            } else {
                lastIndex = middle - 1;
            }
            middle = (firstIndex + lastIndex) / 2;
        }
        if (firstIndex > lastIndex) {
            System.out.println(searchElement + " is not present in the list.\n");
        }
    }

    public static void main(String[] args) {
        int[] list = new int[]{23, 43, 31, 12};
        int number = 12;
        Arrays.sort(list);
        System.out.printf("Binary Search %d in integer array %s %n", number, Arrays.toString(list));
        binarySearch(list, 12);
    }
}

