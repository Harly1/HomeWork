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

        System.out.println(symmetricDifference(set1,set2).toString());

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> diff = new HashSet<T>();
        Set<T> res = new HashSet<T>();

        diff.addAll(set1);
        diff.removeAll(set2);

        res.addAll(set2);
        res.removeAll(set1);
        res.addAll(diff);

        return res;
    }
}
