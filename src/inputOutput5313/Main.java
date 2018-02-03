package inputOutput5313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int strLen = reader.readLine().length();
        Scanner sc = new Scanner(System.in);
        double currDouble = 0.00000;

            for (int i = 0; i<strLen; i++) {
                if(sc.hasNextDouble()){
                    currDouble += sc.nextDouble();
                } else {
                    System.out.println("No");
                }
            }

        System.out.format("%.6f",currDouble);

    }
}

