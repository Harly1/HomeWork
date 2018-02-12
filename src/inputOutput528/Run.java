package inputOutput528;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Run {

    public static void main(String[] args) throws IOException {

            InputStream stream = new ByteArrayInputStream( new byte[] { 0x33, 0x45, 0x01});
      //      InputStream stream = new ByteArrayInputStream(new byte[]{});
            System.out.println(checkSumOfStream(stream));
        }

        public static int checkSumOfStream(InputStream inputStream) throws IOException {
            int sum = 0;
            int  readCur = 0;

            while( (readCur = inputStream.read()) != -1){
                 sum = Integer.rotateLeft(sum,1)^readCur;

            }
            return sum;
        }
    }

