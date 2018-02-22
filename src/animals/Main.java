package animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> list1 = new ArrayList<Animal>();
        list1.add(new Dog());
        list1.add(new Cat());

        for (Animal item : list1) {
            item.voice();
        }

        List<Integer> list = Arrays.asList(1, 4, 5, 7);
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return b.compareTo(a);
            }
        });

        System.out.println(list);

    }
}
