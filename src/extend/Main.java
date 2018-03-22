package extend;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("f", "b", "text");
        Child child = new Child("v", "fg", 23);
        System.out.println(child.content);
        System.out.println(pet.content);
    }
}
