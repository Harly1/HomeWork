package steamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Worlds {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            List<String> list = new ArrayList<>();
            String str = reader.readLine();
            String[] mass = str.split(" ");
            Stream<String> stringStream = Arrays.stream(mass);
            System.out.println("s");


        } catch (Exception e){
                e.printStackTrace();
        }

    }
}
