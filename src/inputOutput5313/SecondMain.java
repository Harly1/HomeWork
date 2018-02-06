package inputOutput5313;

import java.io.IOException;
import java.util.Scanner;

public class SecondMain {
    public static void main(String[] args) throws IOException {
        double currDouble = 0.00000;

        try (Scanner sc = new Scanner(System.in)) {

            while (sc.hasNext()){



            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.format("%.6f",currDouble);
    }


    public static boolean checking(String maybeNumber){
        maybeNumber = maybeNumber.replace(".",",");
        int count = maybeNumber.substring(maybeNumber.indexOf(","),maybeNumber.length()).length() - 1; //убираю ,0 из числа
        if(count == 1){
            maybeNumber = maybeNumber.replace(",0","");
        }

        return true;
    }
}
