package animals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*  List<Animal> list1 = new ArrayList<Animal>();
        list1.add(new Dog());
        list1.add(new Cat());

        for (Animal item : list1) {
            item.voice();
        }*/

        Cat cat = new Cat();   //вопрос?
        cat.kill();


        SuperAnimal dog = new Dog();
        dog.kill();


    /*    Animal[] mass = new Animal[2];
        mass[0] = cat;
        mass[1] = dog;
        for(Animal item: mass){
            item.voice();
        }*/

      /*  List<Integer> list = Arrays.asList(1, 4, 5, 7);
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                return b.compareTo(a);
            }
        });

        int i = 10;
        Integer a = new Integer(10);
        if(a.equals(i))  System.out.println("Yes");*/

    }

}
