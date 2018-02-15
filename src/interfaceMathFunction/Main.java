package interfaceMathFunction;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        MathFunction lamda = x -> x*x;
//        MathFunction ananimus = new MathFunction(){public int operation(int x) { return x * x; }
          List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
          Collections.sort(list, (a,b)-> b.compareTo(a));
          System.out.println(list);


    }

    public static  int doFunction(int r,  MathFunction lamda){
        return lamda.operation(r);
    }

}
