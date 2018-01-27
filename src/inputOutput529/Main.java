package inputOutput529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String s = reader.readLine();
            while(reader.ready()){
                int piece = reader.read();
                System.out.println(piece);
            }

    }

}
