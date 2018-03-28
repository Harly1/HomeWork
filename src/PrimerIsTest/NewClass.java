package PrimerIsTest;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class NewClass {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ObjectOutputStream oOut = new ObjectOutputStream(bOut);
        Whole object = new Whole();
        oOut.writeObject(object);
    }
}
