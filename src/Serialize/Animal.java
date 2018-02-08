package Serialize;

import java.io.*;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        deserializeAnimalArray(Test());
     Test();

    }
    public static byte[] Test() throws IOException {

        int size = 3;

        Animal dog = new Animal("пес");
        Animal cat = new Animal("кот");
        Animal lemur = new Animal("лемур");
        Animal[] animalsSer = {dog,cat,lemur};

        ByteArrayOutputStream byteMass = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(byteMass);

        oos.writeInt(size);

        for (Animal item : animalsSer)
        {
            oos.writeObject(item);
        }

        oos.flush();

        byte[] res = new byte[size];
        return oos.write(res);

    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
    public static Animal[] deserializeAnimalArray(byte[] data) throws IOException, ClassNotFoundException {
        Animal[] animalsDeser = new Animal[data.length];

        try(ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) {

            int size = in.readInt();

            if(size >= 0) {
                for (int i = 0; i < size; i++) {
                    animalsDeser = (Animal[]) in.readObject();
                }
            }

        } catch (IOException e){

            throw new IllegalArgumentException(e);

        }catch (ClassNotFoundException e){

            throw new IllegalArgumentException(e);
        }

        return animalsDeser;

    }



}
