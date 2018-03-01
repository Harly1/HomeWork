package steamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class MinMax {
    public static void main(String[] args) {
        Stream<? extends Integer> stream = Stream.of(1, 2, 5, 6, 7, 4, 3);
        Comparator<? super Integer> order = (a,b)->a.compareTo(b);
        BiConsumer<? super Integer, ? super Integer> minMaxConsumer = (a,b)-> System.out.println(a+" "+b);
        findMinMax(stream,order,minMaxConsumer);
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
            Stream<? extends T> stream1 = stream;

            T max = stream.max(order::compare).get();

            T min = stream1.min(order::compare).get();

            if((max == null) && (min == null)){
                 minMaxConsumer.accept(null, null);

            } else {
                 minMaxConsumer.accept(min, max);
            }
    }
}
