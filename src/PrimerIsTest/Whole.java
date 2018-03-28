package PrimerIsTest;

import java.io.ObjectOutputStream;
import java.io.Serializable;

class Whole implements Serializable {
    public void writeObject(ObjectOutputStream out) {
        System.out.println("Whole.writeObject()");
    }
}
