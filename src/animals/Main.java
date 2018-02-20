package animals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<Animal>();
        list.add(new Dog());
        list.add(new Cat());

        for (Animal item : list) {
            item.voice();
        }
    }
}
