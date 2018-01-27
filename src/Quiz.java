import java.math.BigInteger;
import java.util.Arrays;

public class Quiz {

    public static void main(String[] args) throws Exception {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};
        System.out.println(Arrays.toString(mergeArrays(a1, a2))); //{0,1,2,2,3}
    }
    //StringBuilder

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int a1Len = a1.length;
        int a2Len = a2.length;
        boolean a1Flag =false;
        boolean a2Flag =false;
       // int j = 0;
        for (int i = 0, j=0; i < res.length-1; i++,j++) {
            if(a1Len==i && a1Flag==false){
                a1Flag = true;
            }
            if( a2Len==i && a2Flag==false ){
                a2Flag =true;
            }

            if(a1Flag==false && a2Flag==false){
                if(a1[i]<a2[i]){
                    res[i+j]=a1[i];
                    res[i+1+j]=a2[i];
                 //   j++;
                }
            }
            else if(a1Flag==true && a2Flag==false){
                res[i+j]=a2[i];
                for(int k = res.length-1; k>0;k--)
                    for(int l = 0; k<l; l++ ){
                       if(res[l]>a2[i]){
                           int temp = res[l];
                           res[l] = a2[i];
                           res[i+j] = temp;
                       }
                    }

            }
            else if(a1Flag==false && a2Flag==true){
                res[i+j]=a1[i];

            }
            else if(a1Flag == true && a2Flag == true){
                break;

            }
        }
        return res; // your implementation here
    }
}