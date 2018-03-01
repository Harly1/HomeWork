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

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
            BiFunction <? super T, ? super T,Integer> biFunction = (a,b) -> order.compare(a,b);

            T max = stream.max(order.compare((a,b) -> a.compareTo(b)));
            T min = stream.min(order.compare(T o1, T o2)).get();

            if((max == null) && (min == null)){
                 minMaxConsumer.accept(null, null);

            } else {
                 minMaxConsumer.accept(min, max);
            }
    }
}
