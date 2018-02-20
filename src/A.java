import java.util.*;

public class A {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,4,66));
        int[] mass = new int[]{1, 4, 5};
        Map<Integer,String> map = new HashMap<>();

        map.put(1, "ffff");
        map.put(2, "kkk");

        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            if (it.next().getValue().equals("string1")) {
                it.remove();
            }
        }

        for(Map.Entry<Integer,String> item : map.entrySet()){
            System.out.println(item.getKey()+" "+ item.getValue());
        }
        System.out.println(Arrays.toString(mass));

    }

}
