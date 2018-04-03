package animals;

public class Dog extends SuperAnimal implements Animal {
    @Override
    public void voice() {
        System.out.println("Гав");
    }
}
