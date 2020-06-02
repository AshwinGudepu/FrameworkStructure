package searchingTechnique;

public class LinearSearch {
    //Array may or not in sorting order by default
    public static void main(String[] args) {
        int[] list = new int[]{10, 15, 25, 30,35};
        int keyElement=30;
        int listSize=list.length;

        for(int i=0;i< listSize; i++){
            if(keyElement==list[i]){
                System.out.println("Element Found at Location  "+ i);
                break;
            }
        }
    }
}
