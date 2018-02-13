package Collections_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int piece = 0;
        int position = 0;
        List<Integer> list = new ArrayList<Integer>();

        try (Scanner sc = new Scanner(System.in)) {
            while(sc.hasNextInt()){
                piece = sc.nextInt();
                if(!(position%2 == 0)){
                    list.add(piece);
                }
                position++;
            }

        } catch (Exception e) {

        }

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");

        }

    }
}
