package steamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Worlds {
    public static void main(String[] args) throws IOException {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String str = reader.readLine();
            str =  str.replaceAll("[\\pP]", " ");
            str =  str.replaceAll("  ", "");
            String[] mass = str.split(" ");
            for (int i = 0; i < mass.length; i++) {
                mass[i] = mass[i].toLowerCase();

            }
//             Comparator<Entry<Map.Entry<String, Long>> myComparator = Comparator.comparing(<Map.Entry<String, Long>, Long>>Map.Entry::getValue).thenComparing(Map.Entry::getKey);
//           Comparator<Map.Entry<String,Long>> myComparator = myComparator.thenComparing()

//             Comparator<Entry<String,Long>> myOrder = Comparator.comparing(Map.Entry<Entry<String,Long>>::getValue).thenComparing(Map.Entry::getKey);



            Stream<String> stringStream = Arrays.stream(mass);

            Map<String,Long>  map  = stringStream
                    .collect(Collectors.groupingBy(e -> e,Collectors.counting()));

            map.entrySet().stream()
//                    .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
//                    .sorted(myComparator)
                    .limit(10)
                    .forEach(System.out::println);

        } catch (Exception e){
                e.printStackTrace();
        }

    }
}
