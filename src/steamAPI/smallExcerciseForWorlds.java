package steamAPI;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class smallExcerciseForWorlds {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Анна 5555","Вика 16","Яна 38","Гера 812");
        Comparator<String> myOrder = Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
        list.forEach(a -> {if (!a.equals("Анна 5555")){
            a = "!";
            System.out.println("Yes");
        }
        });
        list.forEach(System.out::println);
//        Collections.sort(list,myOrder);
//        System.out.println(list);
    }
}
