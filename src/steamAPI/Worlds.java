package steamAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Worlds {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        List<String> res = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        String[] words;
        String[] result;
        int frequency = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
            str = str.replaceAll("[\\pP]"," ");
            words = str.split(" ");

            for(String item: words){
                item = item.toLowerCase();
                list.add(item);
            }

            set.addAll(list);

            for(String item: set){
                res.add(Collections.frequency(list,item)+ "%_%" + item);
            }

        } catch (Exception e) {


        }
        Collections.sort(res,(a,b)->b.compareTo(a));

        list.clear();
        for(String item: res){
            list.add(item.substring(item.lastIndexOf("%_%")+3));
        }

        Collections.sort(list,(a,b)->a.compareTo(b));

        if(set.size() >= 10){
            result = new String[10];
            for (int i = 0; i < 10; i++) {
                result[i] = list.get(i);
            }
        } else {
            result = new String[set.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = list.get(i);
            }
        }

        Arrays.sort(result,(a,b)->b.compareTo(a));
        System.out.println(Arrays.toString(result));

    }
}
