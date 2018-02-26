package generic_primer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Conteiner<String> con = new Conteiner<>("rrr");
//        Conteiner<Integer> conInt = new Conteiner<>(3);
//        Conteiner.of(2.0);
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();

        rawList = list;
        rawList.add(8);
        String s = list.get(0);


    }
}
