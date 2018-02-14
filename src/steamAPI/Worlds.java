package steamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Worlds {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] words;
        int frequency = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
            words = str.split(" ");

            for(String item: words){
                list.add(item);
            }

            for(String item: list){
              map.put(Collections.frequency(list,item),item);
            }


        } catch (Exception e) {

        }

        for(Map.Entry<Integer,String> item: map.entrySet()){
            System.out.println(item.getKey()+ " " + item.getValue());
        }
    }
}
