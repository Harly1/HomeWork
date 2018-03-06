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
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"))){

            String str = reader.readLine();
/*            str =  str.replaceAll("[\\pP]", " ");
              str =  str.replaceAll("  ", " ");*/
//            str = str.replaceAll("[\\p{Blank}\\p{Punct}]+"," ");
//            String[] mass = str.split(" ");
            String[] mass = str.split("[\\p{Blank}\\p{Punct}]+");
            for (int i = 0; i < mass.length; i++) {
                mass[i] = mass[i].toLowerCase();

            }

           Comparator<Map.Entry<String,Long>> myOrder1 = Comparator.comparingLong(Map.Entry::getValue); // Long
           Comparator<Map.Entry<String,Long>> myOrder2 = Comparator.comparing(Map.Entry::getKey);       // String


            Stream<String> stringStream = Arrays.stream(mass);

            Map<String,Long>  map  = stringStream
                    .collect(Collectors.groupingBy(e -> e,Collectors.counting())); //собираем мапу

            map.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                    .limit(10)
                    .forEach(a -> System.out.println(a.getKey()));

        } catch (Exception e){
                e.printStackTrace();
        }

    }
}
