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
        String str = "";
        int i =0;
     //   String str = sc.nextLine();
      //  sc = new Scanner(str);

            while (sc.hasNextDouble()){
                currDouble += sc.nextDouble();
  //             String del = convert(currDouble);
 //               str = str.replace(del, "");
//                sc = new Scanner(str);

            }

        System.out.format("%.6f",currDouble);

        }


    public static String convert(Double target) {

        String str = Double.toString(target);
        str = str.replace(".",",");
        int count = str.substring(str.indexOf(","),str.length()).length() - 1; //убираю ,0 из числа
        if(count == 1){
            str = str.replace(",0","");
        }
        return str;
    }

}


