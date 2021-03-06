package sorting;

public class QuickSort {

    //This is also called as divide & conquer algorithm
    //First we will identify one Pivot element in the list i.e is the LOWER BOUND index
    //ALl elements less than Pivot elements are placed towards Left side of the list
    //and all the elements greater than Pivot elements are placed towards Right side of the list
    //This is called Partition

    //if the start element is less than the PIVOT element then we will move the START to right. (Start Element < Pivot Element)
    //if the End element is Greater than the PIVOT element then we will move the END to LEFT. (End Element > Pivot Element)

        //True Condition:
    //PIVOT element Swapping Condition->If START and END cross each other, then the END element should be replaced with PIVOT Element.

    //False Condition:
    // If the START Element is greater then PIVOT element and END Element is Smaller than the Pivot Element. Then Swap START element
    //and END Element

    //If there only PIVOT,START and END then no need to verify the conditions. Further, in the next step make  Start as Pivot and
    //End as both Start/END.

    /*
    --------------------------------------------------
    |       |       |        |       |       |       |
    |7      |6      |10      |5      |9      |2      |
    |Start	|       |        |       |       |End    |                                                                                                      End
    --------------------------------------------------
    Pivot Element=7

    Step 1:
    If(element<=Pivot Element){
        Move Start by one position;
    }else{
        Stop the start
    }
    Step 2:
    If(element > pivot Element){
        Move End by one position
    }else{
        Stop the End
    }
    Step 3:
    Swap Start index element and End index element.
    Step 4:
    If Start > End then swap Pivot element with the END element.

    Now Pivot element will change
*/
}
