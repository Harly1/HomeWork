package steamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerate {
    public static IntStream pseudoRandomStream(int seed) {



        return null; // your implementation here
    }

    public static void main(String[] args) {
        int t =1;
        IntStream.generate(()->t+1)
                .limit(5)
                .forEach(System.out::println);

    }




}
