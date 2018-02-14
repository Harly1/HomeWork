import java.util.Arrays;

public class TestStr {
    static byte[] mass={1,2,3,7,3,4};
    public static void main(String[] args) {
        String str = new String(Arrays.toString(mass).toString());

        System.out.println(Arrays.toString(subSequence(0,3,mass)).toString());
       /*System.out.println(str);
        str.subSequence(1,2);
        System.out.println(str);*/



    }
    public static byte[] subSequence(int start, int end, byte[] m) {
        byte[] res = new byte[(end - start+1)];
        for (int i = 0; i < mass.length; i++) {
            if(i==start){
                for (int j = start,k=i; j <res.length ; j++,k++) {
                    if(j==end){
                        res[j] = mass[k];
                        break;
                    }
                    res[j] = mass[k];
                }
                break;
            }
        }
        return res ;
    }
}
