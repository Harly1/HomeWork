package steamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Worlds {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String str = reader.readLine();
            str =  str.replaceAll("[\\pP]", "");
            String[] mass = str.split(" ");
            for (int i = 0; i < mass.length; i++) {
                mass[i] = mass[i].toLowerCase();

            }
            Stream<String> stringStream = Arrays.stream(mass);
            stringStream
                    .sorted()
                    .forEach(a -> System.out.println());


            System.out.println(Arrays.toString(mass));

//map.entrySet().stream().forEach(e -> i[0] += e.getKey() + e.getValue());

        } catch (Exception e){
                e.printStackTrace();
        }

    }
}
