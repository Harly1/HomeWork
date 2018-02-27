package steamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MinMax {
    public static void main(String[] args) {
//        Stream<? extends Integer> stream = Arrays.stream(new []{1,4,5,2,7};

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

            T max = stream.max(order.compare((p1,p2) -> p1.compareTo(p2)));
            T min = stream.min(order.compare(T o1, T o2)).get();

            if((max == null) && (min == null)){
                 minMaxConsumer.accept(null, null);

            } else {
                 minMaxConsumer.accept(min, max);
            }
    }
}
