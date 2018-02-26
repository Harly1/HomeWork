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
            Optional<? super T> maxValue = stream.max(order.compare(T o1, T o2));

            // your implementation here

    }
}
