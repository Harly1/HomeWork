package steamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerate {
    public static IntStream pseudoRandomStream(int seed) {

        return IntStream.iterate(seed, n -> ((n * n)/10)%1000);
    }

    public static void main(String[] args) {

        int t = 123456;
        t = t/10;
        t = t%1000;
        System.out.println(t);

    }

}
