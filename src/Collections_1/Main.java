package Collections_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list = Arrays.asList(new Integer[]{1, 2, 3} );

        Set<Integer> set1 = new HashSet<Integer>(list);

        list = Arrays.asList(new Integer[]{0, 1, 2} );

        Set<Integer> set2 = new HashSet<Integer>(list);

        Set<Integer> res = new HashSet<Integer>();

        res.addAll(set1);
        set1.removeAll(set2);
        set2.removeAll(res);
        res.clear();
        res.addAll(set1);
        res.addAll(set2);

        for (int i = 0; i < res.toArray().length; i++) // перебор всех элементов  в цикле for
            System.out.print( (res.toArray()[i]) + " " );

        symmetricDifference(set1,set2);
        System.out.println("");

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> res = new HashSet<T>();

        res.addAll(set1);
        set1.removeAll(set2);
        set2.removeAll(res);
        res.clear();
        res.addAll(set1);
        res.addAll(set2);

        return res;
    }



}
