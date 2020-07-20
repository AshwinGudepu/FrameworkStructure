package stringExamples;

public class ZerosAndOtherNumbers {
    public static void main(String[] args) {
        int [] a=new int[]{0,2,0,6,7,0,45,-9,80};
        int [] b=new int[a.length];
        int k=0;

        for(int i=0;i<b.length;i++){
            if(a[i]<0){
                b[k]=a[i];
                k++;
            }
        }

        for(int i=0;i<b.length;i++){
            System.out.println("****"+b[i]);
        }

        for(int j=k;j<b.length;j++){
            if(a[j]>0){
                b[k]=a[j];
                k++;
            }
        }
        /*for(int i=0;i<b.length;i++){
            System.out.println("****"+b[i]);
        }*/
    }
}
