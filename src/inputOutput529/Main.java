package inputOutput529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


              byte[] bytes = {65, 66, 13, 13, 10, 10, 13, 67, 13, 13};
//            byte[] expectedBytes = { 65, 66, 13,     10, 10, 13, 67, 13, 13 };
//            byte[] bytes =         { 65, 13, 10, 10, 13 };
//            byte[] expectedBytes = { 65,     10, 10, 13 };
//            byte[] bytes =         { 1, 2, 13, 10, 3, 4, 13, 10, 5, 6 };
//            byte[] expectedBytes = { 1, 2,     10, 3, 4,     10, 5, 6 };
//            byte[] bytes =         { 1, 2, 3, 13, 10, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3,     10,     10, 4, 5, 6 };
//            byte[] bytes =         { 1, 2, 3 };
//            byte[] expectedBytes = { 1, 2, 3 };
//            byte[] bytes =         { 13, 10, 1, 2, 3, 4, 5, 6 };
//            byte[] expectedBytes = {     10, 1, 2, 3, 4, 5, 6 };
//            byte[] bytes =         { 1, 2, 3, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3,     10, 4, 5, 6 };
//            byte[] bytes =         { 1, 2, 3, 4, 5, 6, 13, 10 };
//            byte[] expectedBytes = { 1, 2, 3, 4, 5, 6,     10 };
//            byte[] bytes =         { 1, 2, 3, 13, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3, 13,     10, 4, 5, 6 };
//            byte[] bytes =         { 1, 2, 3, 10, 13, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3, 10, 13, 4, 5, 6 };
//           byte[] bytes =  {};

     InputStreamReader reader = new  InputStreamReader(System.in);
//     InputStreamReader writer = new  InputStreamReader(System.out.write());
            int piece = reader.read();
            while(piece != -1){
                if(piece!=13){
                    if(piece!=10){
                        System.out.write(piece);

                    }
                }


                piece = reader.read();
            }

    }

}
