package myArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> a = new MyArrayList<>();
//        a.size = 200;

        a.add(1);
        a.add(2);
        a.add(3);
        a.remove(0);
        System.out.println(a.toString());
    }
}
