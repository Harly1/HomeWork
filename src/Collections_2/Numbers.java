package Collections_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int piece = 0;
        int blank = 0;
        int position = 0;
        List<Integer> list = new ArrayList<Integer>();

        try (Scanner sc = new Scanner(System.in)) {

            while(sc.hasNextInt()){
                blank = sc.nextInt();

                if(sc.hasNextInt()){
                    piece = sc.nextInt();
                    list.add(piece);
                    position++;
                }
                else {
//                    System.out.println("k");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");

        }

    }
}
