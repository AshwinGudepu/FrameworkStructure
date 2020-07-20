package stringExamples;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int a[]=new int[]{1,5,20,53};
        int b[]=new int[]{3,6,20,53,61,72};
        int c[]=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            c[k]=b[j];
            k++;
            j++;
        }


        for(int ii=0;ii<c.length-1;ii++){
            System.out.println(c[ii]);
        }
    }
}
