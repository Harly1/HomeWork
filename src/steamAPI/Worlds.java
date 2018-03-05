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

           Comparator<Map.Entry<String,Long>> myOrder1 = Comparator.comparingLong(Map.Entry::getValue); // Long
           Comparator<Map.Entry<String,Long>> myOrder2 = Comparator.comparing(Map.Entry::getKey);       // String

            Stream<String> stringStream = Arrays.stream(mass);

            Map<String,Long>  map  = stringStream
                    .collect(Collectors.groupingBy(e -> e,Collectors.counting()));

            map.entrySet().stream()
//                    .sorted(Map.Entry.comparingByValue(myOrder1).thenComparing(myOrder2))
                    .limit(10)
                    .forEach(System.out::println);

        } catch (Exception e){
                e.printStackTrace();
        }

    }
}
