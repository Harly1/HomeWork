package inputOutput5312;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(inputStream, Charset.forName("ASCII")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        StringBuilder str = new StringBuilder();
        try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset)) {
            int curInt = inputStreamReader.read();

            while (curInt != -1) {
                char cur = (char) curInt;
                str.append(cur);
                curInt = inputStreamReader.read();
            }
            return str.toString();

        } catch (IOException e) {
            throw e;
        }
    }
}


