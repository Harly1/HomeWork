import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class OverLoadRead {
    public static void main(String[] args) throws IOException {
        byte[] mass = new byte[20];
        InputStream in = new ByteArrayInputStream( new byte[] { 1, 2, 3});
        in.read(mass,1,3);
        System.out.println(Arrays.toString(mass));

    }

}