package steamAPI;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MinMax {


    public static void main(String[] args) {
        Stream<? extends Integer> stream = Stream.of(1,4,5);
        Comparator<? super Integer> order = (a,b)->a.compareTo(b);
        BiConsumer<? super Integer, ? super Integer> minMaxConsumer = (a,b)-> System.out.println(a+" "+b);
        findMinMax(stream,order,minMaxConsumer);
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
//            Supplier<Stream<? extends T>> streamSupplier1 = () ->  stream;

        T min;
        T max;
        T[] mass = (T[]) stream.sorted().toArray();

        if (mass.length == 0) {
            min = max = null;
            minMaxConsumer.accept(null, null);
        } else {

            min = mass[0];
            max = mass[mass.length - 1];
                minMaxConsumer.accept(min, max);
            }
    }
}
