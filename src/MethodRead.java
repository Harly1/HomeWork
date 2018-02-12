import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MethodRead {
    public static void main(String[] args) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[]{1, 2, 3, 4});
        byte[] byteArrayInputStream1 = new byte[4];
        try (InputStream reader = byteArrayInputStream)  {
            reader.read(byteArrayInputStream1);
            Arrays.toString(byteArrayInputStream1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
