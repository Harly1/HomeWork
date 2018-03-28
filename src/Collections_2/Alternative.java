package Collections_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alternative {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String str = reader.readLine();
//            String[] mass = str.split("[^\\d]");
            String[] mass = str.split("[\\p{Blank}\\p{Punct}]+");
            for(int i = mass.length-1; i>=0; i--){
                if(!(i%2==0)){
                    System.out.print(mass[i]+" ");
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
