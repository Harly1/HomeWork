package inputOutput529;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {


//              byte[] bytes = {65, 66, 13, 13, 10, 10, 13, 67, 13, 13};
//            byte[] expectedBytes = { 65, 66, 13,     10, 10, 13, 67, 13, 13 };
//            byte[] bytes =         { 65, 13, 10, 10, 13 };
//            byte[] expectedBytes = { 65,     10, 10, 13 };
//            byte[] bytes = { 1, 2, 13, 10, 3, 4, 13, 10, 5, 6 };
//            byte[] expectedBytes = { 1, 2,     10, 3, 4,     10, 5, 6 };
//            byte[] bytes ={ 1, 2, 3, 13, 10, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3,     10,     10, 4, 5, 6 };
//            byte[] bytes = { 1, 2, 3 };
//            byte[] expectedBytes = { 1, 2, 3 };
//            byte[] bytes = { 13, 10, 1, 2, 3, 4, 5, 6 };
//            byte[] expectedBytes = {     10, 1, 2, 3, 4, 5, 6 };
//            byte[] bytes = { 1, 2, 3, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3,     10, 4, 5, 6 };
//            byte[] bytes = { 1, 2, 3, 4, 5, 6, 13, 10 };
//            byte[] expectedBytes = { 1, 2, 3, 4, 5, 6,     10 };
//            byte[] bytes = { 1, 2, 3, 13, 13, 10, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3, 13,     10, 4, 5, 6 };
//            byte[] bytes = { 1, 2, 3, 10, 13, 4, 5, 6 };
//            byte[] expectedBytes = { 1, 2, 3, 10, 13, 4, 5, 6 };
//              byte[] bytes =  {};



//        InputStream inputStream = new ByteArrayInputStream(bytes);
        InputStream inputStream = System.in;


        int cur = inputStream.read();
        int next = inputStream.read();
        while(cur != -1){

            if ((next == 10) && (cur == 13)) {


            } else {
//                    System.out.print(cur + " ");
                System.out.write(cur);
            }

            cur = next;
            next = inputStream.read();
        }

        System.out.flush();

    }

}



