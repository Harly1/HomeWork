package classUnderstanding;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//          A a = new B();
        B b =  new B();
        A a = b;

        List<String> list = Arrays.asList("!!!!!!!!!!!!!!!!!!");

        System.out.println(list);
//          a.test();
    }
}

