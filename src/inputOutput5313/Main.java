package inputOutput5313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double currDouble = 0.00000;
        String temp;
        int i =0;
        int len = sc.nextLine().length();
            while (sc.hasNextDouble() && i < len){

                currDouble += sc.nextDouble();
                i++;
            }
        System.out.format("%.6f",currDouble);

        }

    }


